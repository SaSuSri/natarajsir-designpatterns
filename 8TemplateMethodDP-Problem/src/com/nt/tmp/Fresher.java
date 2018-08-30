package com.nt.tmp;

public abstract class Fresher {
	public boolean aptitude() {
		System.out.println("Aptitude exam");
		return true;
	}

	public boolean groupDiscussion() {
		System.out.println("Group Discussion exam");
		return true;
	}

	public abstract boolean technicalWrittenExam();
	public abstract boolean technicalSystemTest();

	public boolean HRDiscussion() {
		System.out.println("HR Round Discussion");
		return true;
	}
}// class
