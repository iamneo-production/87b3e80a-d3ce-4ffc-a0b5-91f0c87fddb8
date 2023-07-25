package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Customers;
import com.example.demo.Repo.CustomersRepo;
@Service
public class CustomerService {
	@Autowired //extends another class
	CustomersRepo stRepo; //reference variable

	
	
	public Customers savesign(Customers cr) {
		return stRepo.save(cr);
	}

	public Customers Updatesign(Customers c1)
	{
		return stRepo.saveAndFlush(c1);
	}
	
	public void deletesign (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
	public List<Customers> getsign() {
		
		return stRepo.findAll();
	}
}