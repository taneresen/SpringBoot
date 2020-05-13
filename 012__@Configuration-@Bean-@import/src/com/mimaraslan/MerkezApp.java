package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mimaraslan.config.AppConfig;

public class MerkezApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		A  aNesnesi = (A) context.getBean("beana");
		aNesnesi.yaz("Selam A harfi");
		
		B  bNesnesi = (B) context.getBean("beanb");
		bNesnesi.yaz("Selam B Nesnesi");

	}

}
