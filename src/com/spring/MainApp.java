package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
	    System.out.println("Working Directory = " + System.getProperty("user.dir"));

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Sport footaball = context.getBean("mySport",Sport.class);
		footaball.start();
		context.close();
		
		Sport foSport = new Vollyball();
		foSport.start();
		
		/*
		 * Football football = new Football(); 
		 * football.start(); 
		 * Basketball basketball = new Basketball(); 
		 * basketball.start();
		 */
	}

}
