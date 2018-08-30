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

	//Template method defining algorithm for Recruitement Process.
	public final boolean  recruitement(){
	      if(!aptitude())
	          return false;
	       if(!groupDiscussion())
	          return false;
	       if(!technicalWrittenExam())
	            return false;
	       if(!technicalSystemTest())
	             return false;
	       if(!HRDiscussion())
	            return false;
	      return true;
	    }

	 public boolean HRDiscussion(){
	      System.out.println("HR Round Discussion");
	   return true;
	   }
	
	
}// class
