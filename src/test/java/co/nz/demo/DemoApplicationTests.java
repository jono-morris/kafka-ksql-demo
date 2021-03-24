package co.nz.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmployeeService employeeService;
	
	@Test
	void contextLoads() {
		
		employeeService.listStreams();
	}

}
