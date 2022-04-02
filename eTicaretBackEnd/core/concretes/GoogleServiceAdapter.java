package eTicaretBackEnd.core.concretes;

import eTicaretBackEnd.GoogleMailProtocol.GoogleMailManager;
import eTicaretBackEnd.core.abstracts.IGoogleService;

public class GoogleServiceAdapter implements IGoogleService{

	@Override
	public void register(String email, String password) {
		GoogleMailManager googleManager = new GoogleMailManager();
		googleManager.register(email, password);
	}

}
