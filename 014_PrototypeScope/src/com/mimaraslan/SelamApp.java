package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam nesne1 = (Selam) context.getBean("selam");
		
		nesne1.setMesaj("Merhaba Abi");
		nesne1.goster();
		
		Selam nesne2 = (Selam) context.getBean("selam");
		nesne2.goster();
	}

}
