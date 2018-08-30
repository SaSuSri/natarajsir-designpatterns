package com.nt.proxy;

import com.nt.pdp.BankService;
import com.nt.pdp.BankServiceImpl;

public class BankServiceProxy implements BankService {

	@Override
	public String transferMoney(int srcAcno, int destAcno, float amount) {
	    BankService service=null;
		 if(amount>=100000)
			 throw new IllegalArgumentException("Get RBI Aproval becoz amount >=100000");
		 else{
			 service=new BankServiceImpl();
			 return service.transferMoney(srcAcno, destAcno, amount);
		 }
	}//method
}//class
