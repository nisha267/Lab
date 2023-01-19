package com.example.Lab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.entity.Lab_value;

public class Lab_valueTest {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("ApplicationContext.xml");
		BeanFactory b = new XmlBeanFactory(res);
		Lab_value lv = (Lab_value) b.getBean("value");
		Lab_value lv1 = (Lab_value) b.getBean("value1");
		Lab_value lv2 = (Lab_value) b.getBean("value2");
		lv.display();
		lv1.display();
		lv2.display();
	}
}
