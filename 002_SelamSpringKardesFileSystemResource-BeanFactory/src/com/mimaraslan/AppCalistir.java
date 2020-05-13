package com.mimaraslan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class AppCalistir {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		
		//Araba araba = new Araba();
		//IoC-Kontroll+ Ters Cevirme
		Araba araba = (Araba) beanFactory.getBean("araba");
		
		araba.hareketeGec();

	}

}
