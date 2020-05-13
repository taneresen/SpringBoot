package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam selam = (Selam) context.getBean("selam");
		selam.goster();

	}

}
