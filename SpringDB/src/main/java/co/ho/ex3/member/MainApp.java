package co.ho.ex3.member;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		String context = "classpath:beanConfig.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(context);
		
//		DaoTest dao = ctx.getBean("dao", DaoTest.class);
		DaoTest dao = (DaoTest) ctx.getBean("dao");
		dao.run();
		
		ctx.close();
	}
}
