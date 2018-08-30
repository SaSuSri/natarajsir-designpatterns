package com.nt.service;

import com.nt.bo.ProfileBO;
import com.nt.dao.ProfileDAO;
import com.nt.dao.ProfileDAOImpl;
import com.nt.dto.ProfileDTO;

public class ProfileServiceImpl implements ProfileService {

	@Override
	public ProfileDTO showProfile(int pid) {
		ProfileDAO dao=null;
		ProfileBO bo=null;
		ProfileDTO dto=null;
		//use dAO
		dao=new ProfileDAOImpl();
		bo=dao.getProfile(pid);
		//convert BO to DTO
		dto=new ProfileDTO();
		dto.setId(bo.getId());
		dto.setName(bo.getName());
		dto.setAddress(bo.getAddress());
		dto.setEmailId(bo.getEmailId());
		
		return dto;
	}//method
}//class
