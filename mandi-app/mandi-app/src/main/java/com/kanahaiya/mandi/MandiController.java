package com.kanahaiya.mandi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MandiController {

    private final MandiPriceService priceService;

    public MandiController(MandiPriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/api/price/{crop}")
    public MandiPrice getCropPrice(@PathVariable String crop) {
        // In a real app, this data would come from a Database
        // For now, we are creating a "dummy" object to see JSON in action
        return new MandiPrice(crop.toUpperCase(), 2450.0, "Quintal", "2026-01-09");
    }
    
    @GetMapping("/greet")
    public String greetUser(@RequestParam(name="user", defaultValue="Guest") String userName) {
    	return "Namaste " + userName + "!" + priceService.getFormattedPrice();
    }
    
 // Use {city} to tell Spring this part of the URL is a variable
    @GetMapping("/info/{city}")
    public String getCityInfo(@PathVariable("city") String cityName) {
        // This picks up the value from the URL path
        return "Showing Mandi Report for: " + cityName.toUpperCase() + 
               " | " + priceService.getFormattedPrice();
    }
    
}