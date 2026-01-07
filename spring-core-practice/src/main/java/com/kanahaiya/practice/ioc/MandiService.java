package com.kanahaiya.practice.ioc;

public class MandiService {
	public String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "MandiService [location=" + location + "]";
	}
	
}
