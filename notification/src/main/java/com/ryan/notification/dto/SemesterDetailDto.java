package com.ryan.notification.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)
public class SemesterDetailDto {

	private int id;
	private int number;
	private double tuitionFees;
	private double commissionPercentage;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getTuitionFees() {
		return tuitionFees;
	}
	public void setTuitionFees(double tuitionFees) {
		this.tuitionFees = tuitionFees;
	}
	public double getCommissionPercentage() {
		return commissionPercentage;
	}
	public void setCommissionPercentage(double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
