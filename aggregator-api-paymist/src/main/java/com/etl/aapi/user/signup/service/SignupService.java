package com.etl.aapi.user.signup.service;

import com.etl.aapi.common.exception.ServiceException;
import com.etl.aapi.user.data.SignUpData;

public interface SignupService {
	void addSignupData(SignUpData user) throws ServiceException;
	int upateUserStatus(String email, String userId, String status) throws ServiceException;
	boolean isEmailExist(String email) throws ServiceException;
	boolean isUserExist(String email) throws ServiceException;
}
