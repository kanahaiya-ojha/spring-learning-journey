package com.kanahaiya.practice.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsPractice {
   public static void main(String[] args) {
	
	   ApplicationContext context=new ClassPathXmlApplicationContext("com/kanahaiya/practice/annotations/applicationContext.xml");
	   MandiPriceService mandiPriceService=(MandiPriceService) context.getBean("mandiPriceService");
	   mandiPriceService.processPrices();
	   
	   mandiPriceService.process();
	   
	   
}
}
