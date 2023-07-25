package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Customers;
public interface CustomersRepo extends JpaRepository<Customers,Integer>{

}