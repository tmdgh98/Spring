package co.ho.spex.main.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import co.ho.spex.member.service.MemberService;

//@Component
public class TaskSchedule {
	@Autowired
	MemberService memberService;
	
	//초 분 시 일 월 요일
	@Scheduled(cron = "0/10 * * * * *")//둘다간격 delay 끝나는시간기준, rate 시작시간기준 
	public void task1() {
		System.out.println("task1");
		//memberService.memberInsert(null); //필요한 서비스
	}
	
	//밀리세컨드 단위 1/1000초
	@Scheduled(fixedRate = 15*1000)//둘다간격 delay 끝나는시간기준, rate 시작시간기준 
	public void task2() {
		System.out.println("task2");
		//memberService.memberInsert(null); //필요한 서비스
	}
	
	
}
