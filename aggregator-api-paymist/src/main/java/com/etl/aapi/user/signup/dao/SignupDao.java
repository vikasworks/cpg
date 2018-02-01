package com.etl.aapi.user.signup.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.etl.aapi.common.dao.mysql.AbstractMysqlDao;
import com.etl.aapi.common.exception.DataAccessException;
import com.etl.aapi.user.data.SignUpData;
import com.mysql.jdbc.Statement;

@Repository
public class SignupDao extends AbstractMysqlDao{
	private Logger log = LogManager.getLogger(SignupDao.class);
	private final String QUERY_FOR_USER = "insert into `sign_up_user`(`user_id`,`password`,`user_name`,`contact_no`,`company_address`,`email_id`,`created_on`) values(?,?,?,?,?,?,?)";
	private final String SELECT_EMAIL = "select count(*) from `sign_up_user` where `email_id`=?";
	
	@Transactional(rollbackFor = DataAccessException.class)
	public void addSignupData(SignUpData signUpData) throws DataAccessException {
		try {
			insertUserData(signUpData);
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Error occur while registering user due to-" + e.getMessage());
			throw new DataAccessException(e.getMessage());
		}
	}
	
	public int insertUserData(SignUpData signUpData) throws DataAccessException {
		try {

			KeyHolder holder = new GeneratedKeyHolder();

			getJdbcTemplate().update(new PreparedStatementCreator() {

				@Override
				public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
					PreparedStatement ps = connection.prepareStatement(QUERY_FOR_USER, Statement.RETURN_GENERATED_KEYS);
					ps.setString(1, signUpData.getUserId());
					ps.setString(2, signUpData.getPassword());
					ps.setString(3, signUpData.getUserName());
					ps.setString(4, signUpData.getContactNo());
					ps.setString(5, signUpData.getCompanyAddress());
					ps.setString(6, signUpData.getEmailId());
					ps.setDate(7, new Date(Calendar.getInstance().getTime().getTime()));
					return ps;
				}
			}, holder);
			return holder.getKey().intValue();
		} catch (Exception e) {
			// TODO: Put Complete Exception Stack trace
			log.error("Error while saving data due to: " + e.getMessage(), e);
			throw new DataAccessException(e.getMessage(), e);
		}
	}
	
	public boolean isEmailExist(String email) throws DataAccessException {
		try {
			log.debug("SignupDao; isEmailExist; param email " + email + " -starts");
			int count = getJdbcTemplate().queryForObject(SELECT_EMAIL, new Object[] {email}, Integer.class);
			log.debug("SignupDao; isEmailExist; param email " + email + " -end");
			if(count == 0) {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Error occur while fetching email data due to: " + e.getMessage(), e);
			throw new DataAccessException(e.getMessage(), e);
		}
		return true;
	}
}
