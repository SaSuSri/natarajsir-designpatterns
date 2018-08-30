package test;

import com.nt.tmp.Fresher;
import com.nt.tmp.JavaFresher;

public class Recruiter1 {

	public static void main(String[] args) {
	    Fresher java_fresher=null;
	    boolean result;
	       //Recrute  Java Fresher
	       java_fresher=new JavaFresher();
	       result=java_fresher.recruitement();
	        if(result){
	             System.out.println("U R Selected(Java) .. congrats ");
	          }
	       else{
	             System.out.println("Hard Luck . Try again ");
	          }

	}//main
}//class
