package com.hcl.hdfc.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdfcPayModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfcPayModuleApplication.class, args);
		System.out.println("welocme hdfc payments");
		System.out.println("HdfcPayModuleApplication.main()");
	}

}
