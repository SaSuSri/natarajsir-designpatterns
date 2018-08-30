package test;

import com.nt.tmp.Fresher;
import com.nt.tmp.JavaFresher;

public class Recruiter1 {

	public static void main(String[] args) {
	    Fresher java_fresher=null;
	       //Recrute  Java Fresher
	       java_fresher=new JavaFresher();
	       if(!java_fresher.aptitude())
	               return;
	      if(!java_fresher.groupDiscussion())
	         return;
	      if(!java_fresher.technicalWrittenExam())
	       return;
	      if(!java_fresher.technicalSystemTest())
	       return;
	      if(!java_fresher.HRDiscussion())
	       return;
	      System.out.println("U r slected(JAVA) , Welcome to IT Indurstry");

	}//main
}//class
