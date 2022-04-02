package eTicaretBackEnd.business.abstracts;

public interface ICustomerManager {
	boolean isEmailValid(String email);
	void verificationMail(String email);
	boolean isEmailUsed(String email);
	void notifiedMail(String email);
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
}
