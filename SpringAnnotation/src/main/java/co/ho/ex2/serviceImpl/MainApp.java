package co.ho.ex2.serviceImpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import co.ho.ex2.service.TV;

public class MainApp {

	public static void main(String[] args) {
		String context = "classpath:beanConfig.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(context);
		
		TV tv = (TV) ctx.getBean("samsungtv");
		tv.on();
		tv.speaker();
		
		tv = ctx.getBean("lgtv", TV.class);
		tv.on();
		
		ctx.close();
		
	}

}
