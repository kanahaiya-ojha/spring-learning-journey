package com.kanahaiya.mandi;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                  // Lombok generates Getters and Setters
@NoArgsConstructor
@AllArgsConstructor    // Lombok generates a constructor with all fields
@Entity
public class MandiPrice {
	@Id //mark this as primary
	@GeneratedValue(strategy = GenerationType.IDENTITY)// Auto incr the ID 
	private Long id;
	private String cropName;
    private double price;
    private String unit;
    private String lastUpdated;
}
