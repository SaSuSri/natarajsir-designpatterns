package com.nt.flipkart.adapter;

import com.nt.external.PayPalService;
import com.nt.external.PayPalServiceImpl;

public class PaymentInputsAdapter {
	
	public String  doPayment(int cardNo,String bankName,float amount){
		String bankIFSCCode=null;
		PayPalService externalService=null;
		String conformMsg=null;
		//writer Adapter logic to get BankCode IFSC codes based on bank names
		if(bankName.equals("ICICI"))
			 bankIFSCCode="ICIC00000001";
		else if(bankName.equals("SBI"))
			bankIFSCCode="SBIN000001";
		else if(bankName.equals("AXIS"))
			bankIFSCCode="AXIS00001";
		else
			throw new IllegalArgumentException("Invalid Bank");
		
		//use Paypal service (Extenal service)
		externalService= PayPalServiceImpl.getInstance();
		conformMsg=externalService.approveAmount(cardNo, bankIFSCCode, amount);
		return conformMsg;
		
	}

}
