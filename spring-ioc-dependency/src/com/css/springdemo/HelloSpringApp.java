package com.css.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp{

	public static  void main(String[] args){
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container 	
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new methods for fortunes 
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
