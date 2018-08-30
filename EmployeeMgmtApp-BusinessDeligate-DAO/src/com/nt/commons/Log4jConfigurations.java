package com.nt.commons;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;

public class Log4jConfigurations {
	
	public static void  configurations(){
		ResourceBundle bundle=null;
		Set<String> keys=null;
		Properties props=null;
		//locate properties file
		bundle=ResourceBundle.getBundle("com/nt/commons/log4j");
		//get keys of properties file
		keys=bundle.keySet();
		//Strore log4j Proeprties file content to java.util.Properties class object
		props=new Properties();
		for(String key:keys){
			props.put(key,bundle.getString(key));
		}//for
		PropertyConfigurator.configure(props);
	}

}
