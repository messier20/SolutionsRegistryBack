package com.example.solutionsRegistry;

import com.example.solutionsRegistry.services.SolutionsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolutionsRegistryApplication {

	public static void main(String[] args) {

//		SolutionsService services = new SolutionsService();
//		services.putIntoDb();
		SpringApplication.run(SolutionsRegistryApplication.class, args);
//		SpringApplication.run(SolutionsService.class, args);
//		SolutionsService services = new SolutionsService();
//		services.putIntoDb();

	}
}
