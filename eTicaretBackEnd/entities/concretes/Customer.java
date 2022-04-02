package eTicaretBackEnd.entities.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretBackEnd.business.abstracts.ICustomerManager;
import eTicaretBackEnd.business.concretes.CustomerManager;

public class Customer{
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		
		ICustomerManager manager = new CustomerManager();

		if(manager.checkFirstName(firstName)) {
			
			this.firstName = firstName;
			
		}	
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		
		ICustomerManager manager = new CustomerManager();

		if(manager.checkLastName(lastName)) {
			
			this.lastName = lastName;
			
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		List<String> emails = new ArrayList<String>();
		
		List<String> usedMails = new ArrayList<String>();
		
		ICustomerManager manager = new CustomerManager();
		
		if(manager.isEmailValid(email)) {
			
			usedMails.add(email);
		}

		if(manager.isEmailValid(email)) {
				
	
				manager.verificationMail(email);
					
				manager.notifiedMail(email);
					
				this.email = email;
						
				usedMails.add(email);
						
				emails.add(email);						
		   }

		else{
			System.out.println(" Email formatýnýzý  düzeltin");
		}
	}
	public String getPassword() {
		
		return password;
	}
	
	public void setPassword(String password) {
		
		if((password.length())>=6){
			
			this.password = password;
		}
		System.out.println("Þifreniz en az 6 haenli olmak zorunda");
	}
	
}
