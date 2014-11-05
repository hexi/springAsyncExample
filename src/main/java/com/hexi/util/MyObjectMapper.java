package com.hexi.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MyObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = -8077261917466752743L;

	public MyObjectMapper() {
		super();
		this.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		this.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		this.setSerializationInclusion(Include.NON_NULL);
	}

}
