package model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Driver {

	public static void main(String[] args) {
		
		// Traingle triangle = new Traingle();
		// we will not use 'new' keyword anymore. 
		// We will ask BeanFactory to create the objects
		
		
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		
		// getBean() returns an object of that particular class. 
		
		triangle.draw();
		
	}

}
