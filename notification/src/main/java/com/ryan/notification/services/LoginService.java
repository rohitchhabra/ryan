package com.ryan.notification.services;

import com.ryan.notification.dto.NotificationResponse;
import com.ryan.notification.dto.UserDto;

public interface LoginService {

	NotificationResponse login(UserDto userDto) throws Exception;
}
