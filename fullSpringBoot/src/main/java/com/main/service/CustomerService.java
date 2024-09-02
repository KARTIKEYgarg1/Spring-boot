package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.main.beans.Customer;
import com.main.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	public Customer addCustomer(Customer b) {
		repo.saveAndFlush(b);
		return b;
	}
	
	public List<Customer> getAll() {
		return repo.findAll();
	}
	
	public Customer getById(int id) {
		return repo.findById(id).orElse(null);
	}

	public Customer update(Customer b) {
		if(repo.findById(b.getId()).orElse(null)==null)
			return null;
		else
			repo.saveAndFlush(b);
		return b;
	}
	
	public String delete(int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Deleted";
			}
		else
			return "Not Found";
	}
	
}
