package test;

import com.nt.tmp.Fresher;
import com.nt.tmp.PHPFresher;

public class Recruiter2 {

	public static void main(String[] args) {
	    Fresher php_fresher=null;
	       //Recrute  Java Fresher
	       php_fresher=new PHPFresher();
	       if(!php_fresher.aptitude())
	               return;
	      if(!php_fresher.groupDiscussion())
	         return;
	      if(!php_fresher.technicalWrittenExam())
	       return;
	      if(!php_fresher.technicalSystemTest())
	       return;
	      if(!php_fresher.HRDiscussion())
	       return;
	      System.out.println("U r slected(PHP) , Welcome to IT Indurstry");

	}//main
}//class
