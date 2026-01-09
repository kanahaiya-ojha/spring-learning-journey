package com.kanahaiya.mandi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MandiPriceService {
    @Value("${mandi.name:Default Mandi}")
    private String mandiName;
    
    private final MandiData mandiData;
    
    // Constructor Injection is preferred in the industry
    public MandiPriceService(@Qualifier("ujjainMandiData") MandiData mandiData) {
        this.mandiData = mandiData;
    }

    public String getFormattedPrice() {
        return "Current Location: " + mandiName + " | " + mandiData.getInfo();
    }
	
}
