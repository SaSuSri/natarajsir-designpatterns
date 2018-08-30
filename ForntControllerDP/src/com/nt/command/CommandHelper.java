package com.nt.command;

public class CommandHelper {
	
	public static Command  getCommand(String uri){
		Command cmd=null;
		if(uri.equals("/profile.do")){
			cmd=new ProfileCommand();
		}
		return cmd;
		
	}

}
