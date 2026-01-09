package com.kanahaiya.mandi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                  // Lombok generates Getters and Setters
@NoArgsConstructor
@AllArgsConstructor    // Lombok generates a constructor with all fields
public class MandiPrice {
	private String cropName;
    private double price;
    private String unit;
    private String lastUpdated;
}
