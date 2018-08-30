package com.nt.proxy;

import com.nt.pdp.BankService;
import com.nt.pdp.BankServiceImpl;
public class BankServiceFactory {
	
	public static BankService getBankService(boolean RBIMonitoring){
		BankService service=null;
		if(RBIMonitoring){
			service=new BankServiceProxy();
		}
		else{
			service=new BankServiceImpl();
		}
		return service;
	}//method
}//clas
