package co.ho.ex2.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.ho.ex2.service.Sound;
import co.ho.ex2.service.TV;

@Component("samsungtv")
public class SamsungTv implements TV {
	
	//private Sound sound = new Sound();
	@Autowired
	private Sound sound;
	
	public SamsungTv() {
		System.out.println("나는 삼성 TV");
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("삼성");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speaker() {
		// TODO Auto-generated method stub
		sound.soundUp();
		sound.soundDown();
	}

}
