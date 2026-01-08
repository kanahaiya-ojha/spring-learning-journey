package com.kanahaiya.practice.annotations;

import org.springframework.stereotype.Repository;

@Repository
public class DatabaseConnector {
	public String getRawData() {
		return "Raw Data from mandi database";
	}

}
