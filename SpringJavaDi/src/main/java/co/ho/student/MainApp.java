package co.ho.student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx 
//		= new AnnotationConfigApplicationContext(BeanConfig.class);
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:beanXmlConfig.xml");
		
		Student st = ctx.getBean("student1", Student.class);
		st.toString();
		
		st = ctx.getBean("student2", Student.class);
		st.toString();
	}
}
