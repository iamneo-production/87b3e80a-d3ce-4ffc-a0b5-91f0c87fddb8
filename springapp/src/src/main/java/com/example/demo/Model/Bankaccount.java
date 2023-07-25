package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="accountdetails")
public class Bankaccount{
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="phonenumber")
	private long phonenumber;
	@Column(name="accounttype")
	private String accounttype;
	
	
	
	public String getfirstname() {
		return firstname;
	}


	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getlastname() {
		return lastname;
	}


	public void setlastname(String lastname) {
		this.lastname = lastname;
	}




	public String getemail() {
		return email;
	}


	public void setemail(String email) {
		this.email= email;
	}
	

	public long getphonenumber() {
		return phonenumber;
	}


	public void setdateofbirth(long phonenumber) {
		this.phonenumber= phonenumber;
	}
	
	public String getaccounttype() {
		return accounttype;
	}


	public void setgender(String accounttype) {
		this.accounttype= accounttype;
	}



	public Bankaccount(String firstname, String lastname, String email,long phonenumber,String accounttype) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.accounttype = accounttype;
	
	}


	public Bankaccount(){
		
		
	}
}