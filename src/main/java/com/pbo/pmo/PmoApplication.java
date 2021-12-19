package com.pbo.pmo;

import com.pbo.pmo.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class PmoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmoApplication.class, args);
	}

//	@GetMapping
//	public List<Employee> coba() {
//		List<Employee> list = new ArrayList<Employee>();
//		list.add(new Employee("Cica", 'P', "mail@mail.com", "Hatiku", "123"));
//		list.add(new Employee("Balqis", 'P', "mail@mail.com", "Hatiku", "123"));
////		list.remove(1);
//		Employee cobaList = list.get(1);
//		cobaList.setName("Oboy");
//		return list;
//	}

}
