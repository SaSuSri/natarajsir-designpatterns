package test;

import com.nt.tmp.Fresher;
import com.nt.tmp.PHPFresher;

public class Recruiter2 {

	public static void main(String[] args) {
	    Fresher php_fresher=null;
	    boolean result=false;
	       //Recrute  Java Fresher
	       php_fresher=new PHPFresher();
	       result=php_fresher.recruitement();
	        if(result){
	             System.out.println("U R Selected(PHP).. congrats ");
	          }
	       else{
	             System.out.println("Hard Luck . Try again ");
	          }
	}//main
}//class
