package co.ho.spex.member.service;

import java.sql.SQLException;
import java.util.ArrayList;

import co.ho.spex.member.vo.MemberVo;

public interface MemberService {
	ArrayList<MemberVo> memberList() throws SQLException;
	MemberVo memberSelect(MemberVo vo) throws SQLException;
	int memberInsert(MemberVo vo) throws SQLException;
	int memberUpdate(MemberVo vo) throws SQLException;
	int memberDelete(MemberVo vo) throws SQLException;
	
	boolean memberLoginCheck(MemberVo vo) throws SQLException; //멤버로그인 체크
}
