package com.etl.aapi.util;

import com.etl.aapi.gateway.exception.JsonTransformerException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
	
	public static String convertObjectToJSON(Object obj) throws JsonTransformerException{
		String jsonData = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonData = mapper.writeValueAsString(obj);
		} catch (Exception e) {
			// TODO: handle exception
			throw new JsonTransformerException(e.getMessage(), e);
		}
		return jsonData;
	}
	
}
