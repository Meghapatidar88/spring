package com.rays.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//kisi bhi method ko chalane ke liye xml file mai beans main change krna h bs primary= true krna h
public class TestNotificationService {

private MessageService messageService;
	
public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("primary.xml");
		NotificationService notificationService = (NotificationService) context.getBean("notificationService");
		notificationService.sendNotification("Hello, Spring!");
	}
}
