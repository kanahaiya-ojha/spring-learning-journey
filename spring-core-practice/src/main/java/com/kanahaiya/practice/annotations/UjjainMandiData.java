package com.kanahaiya.practice.annotations;

import org.springframework.stereotype.Component;

@Component
public class UjjainMandiData implements MandiData {
	
	public String getInfo() { return "Data from Ujjain Mandi: Wheat at ₹2450"; }
}
