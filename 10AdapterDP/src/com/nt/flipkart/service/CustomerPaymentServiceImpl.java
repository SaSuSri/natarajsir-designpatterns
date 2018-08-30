package com.nt.flipkart.service;

import com.nt.flipkart.adapter.PaymentInputsAdapter;

public class CustomerPaymentServiceImpl implements CustomerPaymentService {

	@Override
	public String payShoppingAmount(int cardNo, String bankName, float amount) {
		PaymentInputsAdapter adapter=null;
		String resultMsg=null;
	   //use Adapter class
		adapter=new PaymentInputsAdapter();
		resultMsg=adapter.doPayment(cardNo, bankName, amount);
		return resultMsg;
	}

}
