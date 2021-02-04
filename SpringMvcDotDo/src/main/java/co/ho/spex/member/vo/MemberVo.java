package co.ho.spex.member.vo;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

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
public class MemberVo implements UserDetails{
	private String memberId;
	private String memberName;
	@JsonIgnore
	private String password;
	private String memberAuth;
	private int memberPoint;
	private int start;
	private int end;
	private List<GrantedAuthority> authorities;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return memberId;
	}
	@Override
	public boolean isAccountNonExpired() { //
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() { //
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() { //패스워드 변경
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() { 
		// TODO Auto-generated method stub
		return true;
	}
	
}
