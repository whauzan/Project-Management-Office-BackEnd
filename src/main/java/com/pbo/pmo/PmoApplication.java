package com.pbo.pmo;

//import com.pbo.pmo.model.Employee;
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
}
