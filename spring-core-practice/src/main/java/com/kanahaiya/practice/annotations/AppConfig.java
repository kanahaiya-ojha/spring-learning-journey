package com.kanahaiya.practice.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//----> replaces the xml config file 
@ComponentScan(basePackages = "com.kanahaiya.practice.annotations")
@PropertySource("classpath:mandi.properties")
public class AppConfig {
      
}
