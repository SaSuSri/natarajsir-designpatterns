package com.nt.tmp;

public class PHPFresher extends Fresher {

	@Override
	public boolean technicalWrittenExam() {
		System.out.println("PHPFresher: PHP technicalWrittenExam");
		return true;
	}

	@Override
	public boolean technicalSystemTest() {
		System.out.println("PHP Fresher:PHP technicalSystemExam");
		return false;
	}

}
