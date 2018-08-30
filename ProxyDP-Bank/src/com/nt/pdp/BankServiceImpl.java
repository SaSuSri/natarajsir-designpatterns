package com.nt.pdp;

public class BankServiceImpl implements BankService{
	@Override
	public String transferMoney(int srcAcno, int destAcno, float amount) {
		return  "Amount ::"+amount +" is transfered from Acno:"+srcAcno+" to Dest Acno:"+destAcno;
	}

}
