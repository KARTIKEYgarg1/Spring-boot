package com.main.controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.beans.Customer;
import com.main.service.CustomerService;

import ch.qos.logback.core.model.Model;

@Controller
public class MainController {
	@Autowired
	private CustomerService serv;
	@GetMapping(value="/")
	public String home(Model m) {
		return "home";
	}
	@GetMapping("/all")
	public ResponseEntity<Customer> all() {
		List<Customer> a=serv.getAll();
		if(a.size()!=0)
		return new ResponseEntity(a,HttpStatus.OK);
		else
			return new ResponseEntity("No Record Found",HttpStatus.NOT_FOUND);
	}
	@PostMapping(path="/add",produces = {"application/xml","application/json"})
	public ResponseEntity<Customer> add(@RequestBody Customer b) {
		Customer a=serv.getById(b.getId());
		if(a==null) {
		serv.addCustomer(b);
		return new ResponseEntity(b,HttpStatus.OK);
		}
		else {
			return new ResponseEntity("ID ALREADY PRESENT",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Customer> find(@PathVariable int id) {
		Customer a=serv.getById(id);
		return a!=null?new ResponseEntity(a,HttpStatus.OK):new ResponseEntity("Not Found",HttpStatus.NOT_FOUND);
		}

	@PutMapping("/update")
	public ResponseEntity<Customer> update(@RequestBody Customer b) {
		Customer a=serv.update(b);
		return a!=null?new ResponseEntity(a,HttpStatus.OK):new ResponseEntity("Not Found",HttpStatus.NOT_FOUND);
		}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Customer> update(@PathVariable int id) {
		String r=serv.delete(id);
		return r=="DELETED"?new ResponseEntity(r,HttpStatus.OK):new ResponseEntity(r,HttpStatus.NOT_FOUND);
	}
}
