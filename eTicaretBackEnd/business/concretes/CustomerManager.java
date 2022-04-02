package eTicaretBackEnd.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretBackEnd.GoogleMailProtocol.GoogleMailManager;
import eTicaretBackEnd.business.abstracts.ICustomerManager;
import eTicaretBackEnd.core.abstracts.IGoogleService;

public class CustomerManager implements ICustomerManager{
	

	public boolean isEmailValid(String email) {
		
	    String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	    
	    CharSequence inputStr = email;
	 
	    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	    
	    Matcher matcher = pattern.matcher(inputStr);
	    
	    return matcher.matches();
	  }

	@Override
	public void verificationMail(String email) {
		
		System.out.println("Doðrulama Maili : "+email+"e gönderildi");
		
		
	}

	@Override
	public boolean isEmailUsed(String email) {
		
		if(isEmailValid(email)) {
			
			List<String> usedMails = new ArrayList<String>();
			
			usedMails.add(email);			
	
		}
		return false;
	}
	public void notifiedMail(String email) {
		
		System.out.println(email +" adresiniz doðrulanmýþtýr");
		
	}
	
	public boolean checkFirstName(String firstName) {
		if(firstName.length()>=2) {
		}
		
		System.out.println("Ýsminiz 2 haneden uzun olmalýdýr");
		return false;
	}

	public boolean checkLastName(String lastName) {
		
		if(lastName.length()>=2) {
			
		}
		System.out.println("Soyisminiz 2 haneden uzun olmalýdýr");
		return false;

	}
	

}
	


