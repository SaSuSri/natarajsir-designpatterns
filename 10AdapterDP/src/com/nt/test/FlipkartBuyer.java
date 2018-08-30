package com.nt.test;

import com.nt.flipkart.service.CustomerPaymentService;
import com.nt.flipkart.service.CustomerPaymentServiceImpl;

public class FlipkartBuyer {
	public static void main(String[] args) {
		CustomerPaymentService localService=null;
		String finalMsg=null;
		
		//use Localservice for payment
		localService= new CustomerPaymentServiceImpl();
		 finalMsg=localService.payShoppingAmount(42342342,"ICICI",4000);
		 System.out.println(finalMsg);
	}
}
