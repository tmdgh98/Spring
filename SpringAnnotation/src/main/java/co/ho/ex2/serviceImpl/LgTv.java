package co.ho.ex2.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.ho.ex2.service.Sound;
import co.ho.ex2.service.TV;

@Component("lgtv")
public class LgTv implements TV {
	
	@Autowired
	private Sound sound;
	
	public LgTv() {
		System.out.println("나는 LG TV");
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("엘지");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speaker() {
		// TODO Auto-generated method stub
		sound.soundUp();
	}
	
}
