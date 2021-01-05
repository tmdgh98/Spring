package co.ho.hello;

import co.ho.hello.service.LGTV;
import co.ho.hello.service.TV;

public class Hello {

	public static void main(String[] args) {
//		TV tv = new SamsungTV();
		TV tv = new LGTV();
		tv.tvOn();
		tv.soundUp();
		tv.soundDown();
		tv.tvOff();
	}

}
