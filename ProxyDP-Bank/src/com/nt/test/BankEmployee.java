package com.nt.test;

import com.nt.pdp.BankService;
import com.nt.proxy.BankServiceFactory;

public class BankEmployee {
	public static void main(String[] args) {
		BankService service=null;
	/*	//get BankService object
		service=BankServiceFactory.getBankService(true);
		System.out.println("service obj class"+service.getClass());
		System.out.println(service.transferMoney(1001,1002, 200000));
		*/
      System.out.println("==========================================");
      service=BankServiceFactory.getBankService(false);
	  System.out.println(service.transferMoney(1001,1002, 200000));
	  System.out.println("Service obj class"+service.getClass());
	}//main
}//clas
