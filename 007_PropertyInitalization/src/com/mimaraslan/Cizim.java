package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cizim {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Ucgen ucgen = (Ucgen) context.getBean("ucgen");
		ucgen.ciz();

	}

}
