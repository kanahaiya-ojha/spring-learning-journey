package com.kanahaiya.practice.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//----> replaces the xml config file 
@ComponentScan(basePackages = "com.kanahaiya.practice.annotations")
public class AppConfig {
      
}
