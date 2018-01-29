package com.ryan.notification.servicesImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ryan.notification.dao.UserRepository;
import com.ryan.notification.dto.NotificationResponse;
import com.ryan.notification.dto.UserDto;
import com.ryan.notification.entity.User;
import com.ryan.notification.services.LoginService;

@Service
@Transactional
public class LoginServiceimpl implements LoginService{

	@Autowired
	private UserRepository userRepository;
	
	/*public void setUserDaoImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}*/

	@Override
	public NotificationResponse login(UserDto userDto) throws Exception {
		NotificationResponse response = new NotificationResponse();
		String email=userDto.getEmail();
		String password = userDto.getPassword();
		if(email == null || password == null || email.equals(null) || password.equals(null)){
			response.setResponseCode("104");
			response.setResponseDesc("Username & password can't be blank");
			return response;
		}
		Map<String, Object> queryParams = new HashMap<>(2);
		queryParams.put("email", email);
		queryParams.put("password", password);
		//User user = (User) baseDaoImpl.findWithNamedQueries("user.findByEmailAndPassword", User.class, queryParams);
		User user = userRepository.findUserByEmailAndPassword(email,password);
		if(user==null){
			response.setResponseCode("103");
			response.setResponseDesc("Username & password does not match");
			return response;
		}
		userDto = new UserDto();
		userDto.setEmail(user.getEmail());
		userDto.setMobileNo(user.getMobileNo());
		userDto.setName(user.getName());
		
		response.setUserDto(userDto);
		response.setResponseCode("101");
		response.setResponseDesc("Success");
		return response;
	}

}
