package com.kanahaiya.practice.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCPracticeXml {
	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/kanahaiya/practice/ioc/applicationContext.xml");
		MandiService mService = (MandiService) applicationContext.getBean("mandiBean");
		System.out.println(mService);
		
         /* *****Setter Injection*******  */
		MandiPriceService mandiPriceService= (MandiPriceService) applicationContext.getBean("mandiPriceService");
		mandiPriceService.processPrices();
		
		/* *****Cunstructor injection******* */
		
		MandiNotifier mandiNotifier = (MandiNotifier) applicationContext.getBean("mandiNotifiere");
		mandiNotifier.alertFarmer();
		
	    
		
	}
}
