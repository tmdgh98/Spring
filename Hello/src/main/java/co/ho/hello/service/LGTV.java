package co.ho.hello.service;

public class LGTV implements TV {

	@Override
	public void tvOn() {
		System.out.println("LG TV 켜짐");

	}

	@Override
	public void tvOff() {
		System.out.println("LG TV 꺼짐");

	}

	@Override
	public void soundUp() {
		System.out.println("LG TV 볼륨 업");

	}

	@Override
	public void soundDown() {
		System.out.println("LG TV 볼륨 다운");

	}

}
