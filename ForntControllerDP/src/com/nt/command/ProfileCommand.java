package com.nt.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.ProfileDTO;
import com.nt.service.ProfileService;
import com.nt.service.ProfileServiceImpl;
import com.nt.vo.ProfileVO;

public class ProfileCommand implements Command {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException {
	 ProfileVO  pVO=null;
	 ProfileService service=null;
	 ProfileDTO dto=null;
		//use service class
		service=new ProfileServiceImpl();
		dto=service.showProfile(Integer.parseInt(req.getParameter("pid")));
		//convert DTO class obj to VO class object
	    pVO=new ProfileVO();
	    pVO.setId(String.valueOf(dto.getId()));
	    pVO.setName(dto.getName());
	    pVO.setAddress(dto.getAddress());
	    pVO.setEmailId(dto.getEmailId());
	    //keep VO in request scope
	    req.setAttribute("profileInfo",pVO);
	    //return view name
		return "display_profile";
	}
	
	

}
