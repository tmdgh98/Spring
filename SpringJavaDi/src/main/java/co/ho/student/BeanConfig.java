package co.ho.student;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource("classpath:beanConfig.xml")//자바에 xml포함시키기
public class BeanConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("게임");
		hobbys.add("숨쉬기");
		hobbys.add("누워있기");
		
		Student student = new Student("승호", "32", hobbys);
		student.setHeight("177");
		
		return student;
	}
	
	
}
