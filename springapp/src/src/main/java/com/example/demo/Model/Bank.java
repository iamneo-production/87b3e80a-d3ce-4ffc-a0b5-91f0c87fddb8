package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bankapp")
public class Bank {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="Mail")
	private String Mail;
	@Column(name="Name")
	private String Name;
	@Column(name="Password")
	private String Password;
	
	
	
	
	public String getMail() {
		return Mail;
	}


	public void setMail(String Mail) {
		this.Mail = Mail;
	}


	public String Name() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String Password) {
		this.Password = Password;
	}




	public Bank(String Mail, String Name, String Password) {
		super();
		this.Mail = Mail;
		this.Name = Name;
		this.Password = Password;
	
	}


	public Bank() {
		
		
	}
}