package com.nt.dao;

import com.nt.bo.ProfileBO;

public class ProfileDAOImpl implements ProfileDAO {

	@Override
	public ProfileBO getProfile(int pid) {
		ProfileBO pBO=null;
		//prepare BO having profile info (collect from DB)
		 pBO=new ProfileBO();
		 pBO.setId(pid);
		 pBO.setName("raja");
		 pBO.setAddress("hyd");
		 pBO.setEmailId("raja@gmail.com");
		
		return pBO;
	}

}
