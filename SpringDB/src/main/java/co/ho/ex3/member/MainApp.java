package co.ho.ex3.member;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import co.ho.ex3.member.service.MemberService;
import co.ho.ex3.member.vo.MemberVo;

public class MainApp {
	public static void main(String[] args) {
		String context = "classpath:beanConfig.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(context);
		
//		DaoTest dao = ctx.getBean("dao", DaoTest.class);
		MemberService member =  (MemberService) ctx.getBean("memberService");
		ArrayList<MemberVo> list = member.selectAll();
		
		for(MemberVo vo : list) {
			vo.toString();
		}
		
		ctx.close();
	}
}
