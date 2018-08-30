package com.nt.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.command.Command;
import com.nt.command.CommandHelper;
import com.nt.dispatcher.Dispatcher;

public class FrontControllerServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri=null;
		Command cmd=null;
		String viewName=null;
		Dispatcher dispatcher=null;
		//get request uri
	   uri=req.getServletPath();
	   System.out.println(uri);
	   //get Command obj
	   cmd=CommandHelper.getCommand(uri);
	   //use Command
	   viewName=cmd.execute(req, res);
	   // get Dispatcher object
		dispatcher=new Dispatcher();
		dispatcher.dispatch(req,res,viewName);
	}//doGet(-,-)
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  doGet(req,res);
	}//doPost(-,-)
}//class
