package com.etl.aapi.db.mysql.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.etl.aapi.springframework.ApplicationContextProvider;

public class MysqlConnection {
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate(){
		if(null == jdbcTemplate){
			jdbcTemplate = ApplicationContextProvider.getApplicationContext().getBean("jdbcTemplate", JdbcTemplate.class);
		}
		return jdbcTemplate;
	}
}
