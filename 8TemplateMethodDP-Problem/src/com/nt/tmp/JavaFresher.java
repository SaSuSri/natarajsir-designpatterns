package com.nt.tmp;

public class JavaFresher extends Fresher {

	@Override
	public boolean technicalWrittenExam() {
		System.out.println("JavaFresher:technicalWrittenExam");
		return true;
	}

	@Override
	public boolean technicalSystemTest() {
		System.out.println("JavaFresher:technicalSystemExam");
		return true;
	}

}
