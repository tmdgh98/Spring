package spring.aop.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewlecExam implements Exam {
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	@Override
	public int total() {
		//long start = System.currentTimeMillis();
		int result = kor+eng+math+com;
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		long end = System.currentTimeMillis();
//		String message = (end - start) + "ms 시간";
//		System.out.println(message);
		return result;
	}

	@Override
	public float avg() {
		
		float result = total() / 4.0f;
		
		return result;
	}
	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

}
