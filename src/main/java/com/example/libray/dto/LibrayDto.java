package com.example.libray.dto;

public class LibrayDto {

	private String name;
	private String email;
	private String mobileNo;
	
	@Override
	public String toString() {
		return "LibrayDto [name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
