package co.ho.ex3.member.service;

import java.util.ArrayList;

import co.ho.ex3.member.vo.MemberVo;

public interface MemberService {
	ArrayList<MemberVo> selectAll();
	MemberVo select(MemberVo vo);
	int insert(MemberVo vo);
	int update(MemberVo vo);
	int delete(MemberVo vo);
}
