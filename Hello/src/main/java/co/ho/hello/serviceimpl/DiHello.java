package co.ho.hello.serviceimpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import co.ho.hello.service.TV;
import co.ho.hello.vo.FamilyVo;

public class DiHello {
	public static void main(String[] args) {
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml","beanConfig2.xml");
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");
		TV tv = ctx.getBean("tv", TV.class);
		FamilyVo vo = ctx.getBean("family", FamilyVo.class);
		
		tv.tvOn();
		tv.soundUp();
		tv.soundDown();
		tv.tvOff();
		
		vo.toString();
		
		ctx.close();//IOC 컨테이너 메모리를 반환하라
	}
}
