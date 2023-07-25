package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customerinfo")
public class Customers{
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="dateofbirth")
	private String dateofbirth;
	@Column(name="gender")
	private String gender;
	
	
	
	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}


	public String getpassword() {
		return password;
	}


	public void setEmployeeName(String password) {
		this.password = password;
	}




	public String getemail() {
		return email;
	}


	public void setemail(String email) {
		this.email= email;
	}
	

	public String getdateofbirth() {
		return dateofbirth;
	}


	public void setdateofbirth(String dateofbirth) {
		this.dateofbirth= dateofbirth;
	}
	
	public String getgender() {
		return gender;
	}


	public void setgender(String gender) {
		this.gender= gender;
	}



	public Customers(String name, String password, String email,String dateofbirth,String gender) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
	
	}


	public Customers(){
		
		
	}
}