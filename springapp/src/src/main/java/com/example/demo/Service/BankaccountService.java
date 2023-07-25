package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bankaccount;

import com.example.demo.Repo.BankaccountRepo;

@Service
public class BankaccountService {
	@Autowired //extends another class
	BankaccountRepo stRepo; //reference variable

	
	public Bankaccount saveacc(Bankaccount ar) {
		return stRepo.save(ar);
	}

	public Bankaccount Updateacc(Bankaccount c1)
	{
		return stRepo.saveAndFlush(c1);
	}
	
	public void deleteacc (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}


	public List<Bankaccount> getAcc() {
		
		return stRepo.findAll();
	}
}