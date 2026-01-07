package com.kanahaiya.practice.ioc;

public class MandiNotifier {
    private final MessageService messageService;
    
    //cunstructor Injection
    public MandiNotifier(MessageService messageService) {
    	this.messageService=messageService;
    }
    
    public void alertFarmer() {
    	messageService.sendMessage("Soyabean prices just hit Rs 2600 !");
    }
}
