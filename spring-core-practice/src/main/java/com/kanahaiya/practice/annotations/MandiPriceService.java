package com.kanahaiya.practice.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class MandiPriceService {
	@Autowired
	private DatabaseConnector dbConnector;

	public DatabaseConnector getDbConnector() {
		return dbConnector;
	}

	public void setDbConnector(DatabaseConnector dbConnector) {
		this.dbConnector = dbConnector;
	}
	
	public void processPrices() {
		String data =dbConnector.getRawData();
		System.out.print("using autowire annotation ");
		System.out.println("processing: "+ data +" -> Price: Rs2400/-");
	}

}
