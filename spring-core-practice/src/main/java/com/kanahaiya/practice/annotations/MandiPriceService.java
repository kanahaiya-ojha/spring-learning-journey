package com.kanahaiya.practice.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class MandiPriceService {
	@Value("${mandi.name}")
	private String name;
	
	@Value("${mandi.fee}")
	private double fee;
	
	@Value("${mandi.contact}")
	private String contact;
	@Autowired
	private DatabaseConnector dbConnector;
	@Autowired
	@Qualifier("ujjainMandiData") // This tells Spring: "Use the Ujjain implementation!"
	private MandiData mandiData;
    
	@PostConstruct
	public void init() {
		System.out.println(">> MandiPriceService: Initializing connections to " + mandiData.getClass().getSimpleName());
	}
	
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
	
	public void process() {
//        System.out.println(mandiData.getInfo());
		System.out.println("Mandi:"+ name + " | Commission Fee : " + fee +"%  | contact :"+contact);
    }
	
	@PreDestroy
	public void cleanup() {
		System.out.println(">> MandiPriceService: Closing all data streams before shutdown.");
    }
		
}


