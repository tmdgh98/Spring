package co.ho.ex2.service;

import org.springframework.stereotype.Service;

@Service
public class Sound {
	public void soundUp() {
		System.out.println("소리를 증가 시킨다.");
	}
	public void soundDown() {
		System.out.println("소리를 감소 시킨다.");
	}
}
