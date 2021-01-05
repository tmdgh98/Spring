package co.ho.hello.service;

public class SamsungTV implements TV {

	@Override
	public void tvOn() {
		System.out.println("삼성 TV 켜짐");

	}

	@Override
	public void tvOff() {
		System.out.println("삼성 TV 꺼짐");

	}

	@Override
	public void soundUp() {
		System.out.println("삼성 TV 볼륨 업");

	}

	@Override
	public void soundDown() {
		System.out.println("삼성 TV 볼륨 다운");

	}

}
