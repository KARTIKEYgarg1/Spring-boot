package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.main.repo.EmployeeRepo;
import com.main.service.EmployeeService;

@SpringBootTest
class SpringWithMongoApplicationTests {

	@InjectMocks
	private EmployeeService serv;
	@Mock
	private EmployeeRepo repo;
	@Test
	void getAll() {
		Employee m=new Employee();
		m.setId(0);m.setName("NAME");m.setEmail("a.email.com");
		when(repo.save(m)).thenReturn(m);
		serv.add(m);
		when(repo.findById(0)).thenReturn(Optional.of(m));
		assertNotNull(serv.getEmpById(0));
	}
	@Test
	void get() {
		Employee m=new Employee();
		m.setId(0);m.setName("NAME");m.setEmail("a.email.com");
		when(repo.save(m)).thenReturn(m);
		serv.add(m);
		when(repo.findById(0)).thenReturn(Optional.of(m));
		assertEquals(serv.getEmpById(0),m);
	}
}
