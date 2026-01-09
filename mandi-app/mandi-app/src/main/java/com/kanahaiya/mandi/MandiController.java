package com.kanahaiya.mandi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MandiController {

    private final MandiPriceService priceService;

    public MandiController(MandiPriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/prices") // Visit http://localhost:8081/prices
    public String showPrices() {
        return priceService.getFormattedPrice();
    }
    
    @GetMapping("/greet")
    public String greetUser(@RequestParam(name="user", defaultValue="Guest") String userName) {
    	return "Namaste " + userName + "!" + priceService.getFormattedPrice();
    }
}