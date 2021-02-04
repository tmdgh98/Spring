package co.ho.spex.member.vo;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class MemberValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		MemberVo vo = (MemberVo) target;
		
		ValidationUtils.rejectIfEmpty(errors, "memberId", null, "아이디 입력");

		if(vo.getMemberName()==null){
			errors.rejectValue("memberName", null, "이름입력");
		}
	}
	
}
