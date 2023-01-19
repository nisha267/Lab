package com.example.Lab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.entity.Lab_collection;

public class lab_collectionTest {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("ApplicationContext.xml");
		BeanFactory b = new XmlBeanFactory(res);
		Lab_collection l = (Lab_collection) b.getBean("lab1");

		l.display();
	}
}
