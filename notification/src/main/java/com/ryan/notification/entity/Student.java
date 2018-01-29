package com.ryan.notification.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/*
 * Class: Student to hold the details of student
 */
@Entity
@Table(name="student")
public class Student {

	// Id of student
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;
	
	// Name of student
	@Column(name="student_name")
	private String name;
	
	// Passport number of student
	@Column(name="student_passportnumber")
	private String passportNumber;
	
	// College details of student
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "student", cascade = CascadeType.ALL)
	//private College studentCollege;
	
	@Column(name="college")
	private String college;
	
	@Column(name="country")
	private String country;
	
	@Column(name="pin_code")
	private String pinCode;
	
	// Address of student
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "student", cascade = CascadeType.ALL)
	//private Address studentAddress;
	
	@Column(name="address_city")
	private String city;
	
	// Address1 of student address
	@Column(name="address_line1")
	private String addressLine1;
	
	// Address2 of student address
	@Column(name="address_line2")
	private String addressLine2;
	
	// Date of birth of student
	@Column(name="student_dob")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	// Agent Name
	@Column(name="student_agentname")
	private String agentName;
	
	//List of semester details for each student
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_semesterdetails", joinColumns={@JoinColumn(name="student_id")},inverseJoinColumns={@JoinColumn(name="semesterdetail_id")})
	private List<SemesterDetail> semesterDetails;
	
	//Course in which student is enrolled in the college
	@Column(name="student_course")
	private String course;
	
	//Number of semesters
	@Column(name="student_numberOfSemesters")
	private int numberOfSemesters;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public List<SemesterDetail> getSemesterDetails() {
		return semesterDetails;
	}
	public void setSemesterDetails(List<SemesterDetail> semesterDetails) {
		this.semesterDetails = semesterDetails;
	}	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getNumberOfSemesters() {
		return numberOfSemesters;
	}
	public void setNumberOfSemesters(int numberOfSemesters) {
		this.numberOfSemesters = numberOfSemesters;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	
	
}
