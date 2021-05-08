package com.spjpa.weekendjpa;

import com.spjpa.weekendjpa.model.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WeekendjpaApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void testGetAllEmployees(){

		ResponseEntity<Employee[]> entity=
				testRestTemplate.getForEntity("/getAllEmps",
						Employee[].class);
		assertEquals(1,entity.getBody().length);
	}
}
