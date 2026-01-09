package com.kanahaiya.practice.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsPractice {
   public static void main(String[] args) {
	
//	   ApplicationContext context=new ClassPathXmlApplicationContext("com/kanahaiya/practice/annotations/applicationContext.xml");
//	   MandiPriceService mandiPriceService=(MandiPriceService) context.getBean("mandiPriceService");
//	   mandiPriceService.processPrices();
//	   
//	   mandiPriceService.process();
	   
	   
	   ApplicationContext context2=new AnnotationConfigApplicationContext(AppConfig.class);
	   MandiPriceService service=context2.getBean(MandiPriceService.class);
	   service.process();
	   ((AbstractApplicationContext) context2).close();
	   
}
}
