package com.bankapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.entities.Account;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;
@SpringBootApplication
public class BankapplicationApplication implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(BankapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
//		Account account1=new Account("Afreen", 1024181, "Afreen@gmail.com", 
//				"NELLORE","HDFC", 15000,"SAVINGS");
//		
//		Account account2=new Account("Zuveriya", 5305677, "Zuvvu@gmail.com", 
//				"NELLORE","ANDHRABANK", 6500,"CURRENT");
//		
//		Account account3=new Account("Sana", 0939852, "sana@gmail.com", 
//				"NELLORE","ICICI", 20000, "SAVINGS");
//		
//		Account account4=new Account("Rayhan", 0799375, "Rayhan@gmail.com", 
//				"NELLORE","CITYBANK", 12000,"SAVINGS");
//		
//		Account account5=new Account("Reehana", 0998581, "Reehu@gmail.com", 
//				"NELLORE","STATEBANK", 25670, "CURRENT");
//		
//		
//		accountService.addCustomerAccount(account1);
//		accountService.addCustomerAccount(account2);
//		accountService.addCustomerAccount(account3);
//		accountService.addCustomerAccount(account4);
//		accountService.addCustomerAccount(account5);
		

		
	}

}
