package com.nashtech.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nashtech.assignment.entity.Account;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
		Account account = new Account();
		account.getAccountID();
	}
}
