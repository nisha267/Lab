package com.Spring.demo;

//1. Create a spring application with Constructor Dependency 
//Injection & apply :
//
//b.. constructor injection with Dependent object
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.Lab_Object;

public class LabObject_test {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("ApplicationContext.xml");
		BeanFactory b = new XmlBeanFactory(res);
		Lab_Object lo = (Lab_Object) b.getBean("ob");

		lo.display();
	}
}
