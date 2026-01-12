package com.kanahaiya.mandi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MandiRepository repository;

    public DataInitializer(MandiRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        // Save initial data so we can test the API
        repository.save(new MandiPrice(null, "WHEAT", 2450.0, "Quintal", "2026-01-09"));
        repository.save(new MandiPrice(null, "SOYABEAN", 4200.0, "Quintal", "2026-01-09"));
        System.out.println(">> H2 Database seeded with data!");
    }
}