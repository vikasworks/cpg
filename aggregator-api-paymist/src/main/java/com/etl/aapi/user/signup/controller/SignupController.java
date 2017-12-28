package com.etl.aapi.user.signup.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.etl.aapi.common.data.APIConstant;
import com.etl.aapi.common.data.StatusResponse;
import com.etl.aapi.common.exception.ServiceException;
import com.etl.aapi.user.data.SignUpData;
import com.etl.aapi.user.signup.service.SignupService;
import com.etl.aapi.util.ErrorUtils;
import com.etl.aapi.util.JsonUtils;

@RestController
public class SignupController {
	
	private Logger log = LogManager.getLogger(SignupController.class);
	private SignupService signupService;
	private String event = "";

	@Autowired
	public void setSignupService(SignupService signupService) {
		this.signupService = signupService;
	}
	@RequestMapping(value = "/user/sign-up", method = RequestMethod.POST)
	public ResponseEntity<?> registerUser(@RequestBody @Valid SignUpData user, BindingResult result)
			throws ServiceException {
		log.debug("API name user/sign-up -start");
		event = "register user";
		StatusResponse signupResponse = null;
		if (result.hasErrors()) {
			log.debug(result.getAllErrors());
			String errorMessage = ErrorUtils.getErrorMessage(result);
			return new ResponseEntity<>(new StatusResponse(412, errorMessage, event, APIConstant.FAILURE),
					HttpStatus.PRECONDITION_FAILED);
		}
		String jsonSignupData = "";
		try {
			jsonSignupData = JsonUtils.convertObjectToJSON(user);
		} catch (Exception e) {
			log.error("Error while conversion");
		}
		log.info("New SignUp Alert", "Process started for " + user.getUserName());
		log.info("Received JSON SignUp data :: " + jsonSignupData);
		signupService.addSignupData(user);
		signupResponse = new StatusResponse(event, APIConstant.SUCCESS);
		String jsonSignupResponse = "";
		try {
			jsonSignupResponse = JsonUtils.convertObjectToJSON(signupResponse);
		} catch (Exception e) {
			log.error("Error while conversion");
		}
		log.info("New SignUp Alert", "Process End for " + user.getUserName());
		log.info("Response JSON SignUp data :: " + jsonSignupResponse);
		return new ResponseEntity<>(signupResponse, new HttpHeaders(), HttpStatus.OK);
	}

}
