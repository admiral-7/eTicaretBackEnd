package eTicaretBackEnd;

import eTicaretBackEnd.GoogleMailProtocol.GoogleMailManager;
import eTicaretBackEnd.business.abstracts.ICustomerManager;
import eTicaretBackEnd.business.concretes.CustomerManager;
import eTicaretBackEnd.core.abstracts.IGoogleService;
import eTicaretBackEnd.entities.concretes.Customer;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Customer customer = new Customer();
	Customer customer1 = new Customer();

	ICustomerManager customerManager = new CustomerManager();
	IGoogleService googleManager = new GoogleMailManager();
		
	customer1.setId(1);
	customer1.setFirstName("h");
	customer1.setLastName("gün");
	customer1.setEmail("harungungmez.02@gmail.com");
	customer1.setPassword("12345");
	customerManager.isEmailValid(customer1.getEmail());
	googleManager.register(customer1.getEmail(), customer1.getPassword());

	}
}

