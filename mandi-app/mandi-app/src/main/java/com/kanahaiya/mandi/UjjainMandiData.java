package com.kanahaiya.mandi;

import org.springframework.stereotype.Component;

@Component
public class UjjainMandiData implements MandiData{
     @Override
     public String getInfo() {
    	 return "Ujjain mahakal mandi wheat: Wheat - ₹2450/quintal, Soyabean - ₹4200/quintal\"";
     }
}
