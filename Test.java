package pack.basic_spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {  
	public static void main(String[] args) {  
		//Student s=new Student();
		//		s.displayInfo("ravi");
	    Resource resource=new ClassPathResource("employeebean.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("studentbean");  
	    student.displayInfo();  
	}  
	}  


