package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Bankaccount;
public interface BankaccountRepo extends JpaRepository<Bankaccount,Integer>{
}