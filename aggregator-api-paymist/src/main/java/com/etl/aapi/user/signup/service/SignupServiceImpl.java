package com.etl.aapi.user.signup.service;


import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etl.aapi.common.exception.ServiceException;
import com.etl.aapi.user.data.SignUpData;
import com.etl.aapi.user.signup.dao.SignupDao;


@Service
public class SignupServiceImpl implements SignupService {
	private Logger log = LogManager.getLogger(SignupServiceImpl.class);
	private static final String STR_EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern EMAIL_PATTERN = Pattern.compile(STR_EMAIL_PATTERN);
	
	private SignupDao signupDao;
	
	@Autowired
	public void setSignupDao(SignupDao signupDao){
		this.signupDao = signupDao;
	}
	@Override
	public void addSignupData(SignUpData user) {
		try {
		log.info("Signup ServiceImpl starts for the user :: " + user.getUserName());
		signupDao.addSignupData(user);
		log.debug("SignupServiceImpl; param userData: " + user.getUserName() + " -end");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Override
	public int upateUserStatus(String email, String userId, String status) throws ServiceException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmailExist(String email) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isUserExist(String email) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	
}
