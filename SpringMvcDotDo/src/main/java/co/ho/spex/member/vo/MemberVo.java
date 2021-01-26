package co.ho.spex.member.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
//@Getter 
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Builder //만능생성자
public class MemberVo {
	private String memberId;
	private String memberName;
	@JsonIgnore
	private String password;
	private String memberAuth;
	private int memberPoint;
	private int start;
	private int end;
	
}
