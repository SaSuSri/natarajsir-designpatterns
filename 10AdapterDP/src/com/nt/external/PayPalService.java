package com.nt.external;

public interface PayPalService {
	
	public String  approveAmount(int cardNo,String bankIFSCCode,float amount);

}
