package com.kanahaiya.practice.ioc;

public class MandiPriceService {
	private DatabaseConnector dbConnector;

	public DatabaseConnector getDbConnector() {
		return dbConnector;
	}

	public void setDbConnector(DatabaseConnector dbConnector) {
		this.dbConnector = dbConnector;
	}
	
	public void processPrices() {
		String data =dbConnector.getRawData();
		System.out.println("processing: "+ data +" -> Price: Rs2400/-");
	}

}
