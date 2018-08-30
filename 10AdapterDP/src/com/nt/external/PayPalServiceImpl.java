package com.nt.external;

public class PayPalServiceImpl implements PayPalService {
   private static PayPalServiceImpl instance;
   
   private PayPalServiceImpl(){
	   
   }
   
   public static PayPalService getInstance(){
	      if(instance==null){
	    	  synchronized(PayPalServiceImpl.class){
	    		  if(instance==null)
	    			  instance=new PayPalServiceImpl();
	    	  }//sychronized
	      }//if
	      return instance;
   }//method
	
	@Override
	public String approveAmount(int cardNo, String bankIFSCCode, float amount) {
		
		//writer  jdbc code to approve the amount
		
		return cardNo+" is approved for payment of "+ amount +" from the bank--->"+bankIFSCCode;
	}

}
