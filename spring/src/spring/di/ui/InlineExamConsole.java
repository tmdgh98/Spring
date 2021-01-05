package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {
	@Autowired
	//@Qualifier("exam1")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("생성자");
		// TODO Auto-generated constructor stub
	}
	
	
	public InlineExamConsole(Exam exam) {
		System.out.println("오버로드 생성자");
		this.exam = exam;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.printf("total is %d, avg is %f \n", exam.total(), exam.avg());
	}
	
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("세터");
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}
