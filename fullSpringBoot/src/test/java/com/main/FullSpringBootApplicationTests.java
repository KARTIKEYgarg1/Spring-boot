package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.main.beans.Customer;
import com.main.repo.CustomerRepo;
import com.main.service.CustomerService;

@SpringBootTest
class FullSpringBootApplicationTests {
	@InjectMocks
	private CustomerService service;

	@Mock
	private CustomerRepo repo;

	@Test
	void addCustomer() {
		Customer c = new Customer(10, "KART", "PUN", 32, "20-11-2002");
		Customer result = service.addCustomer(c);

        // Mocking repo.saveAndFlush to return the same customer object
        when(repo.saveAndFlush(c)).thenReturn(c);
        
		assertNotNull(result);
		assertEquals(10, result.getId());
	}
	@Test
	void getALL() {

		Customer c = new Customer(9, "KART", "LKO", 32, "20-11-2002");
		Customer result = service.addCustomer(c);
		Customer b = new Customer(11, "ABC", "CB", 30, "20-11-2002");
		result = service.addCustomer(b);
		Customer a= new Customer(12, "DEF", "MP", 31, "20-11-2002");
		result = service.addCustomer(a);
		// Mocking repo.findAll to return a list of customers
        List<Customer> customers = Arrays.asList(c, b, a);
        when(repo.findAll()).thenReturn(customers);
		assertNotNull(service.getAll());
//		assertEquals(service.getAll().size(), 0);
//		assertEquals(service.getById(10), c);
//		assertEquals(service.getById(11), b);
//		assertEquals(service.getById(12), a);
	}
	@Test
	void getById() {
		Customer c = new Customer(9, "KART", "LKO", 32, "20-11-2002");
		Customer result = service.addCustomer(c);
		when(repo.findById(9)).thenReturn(Optional.of(c));
		assertNotNull(service.getById(9));
		assertEquals(c, result);
	}
	

}
