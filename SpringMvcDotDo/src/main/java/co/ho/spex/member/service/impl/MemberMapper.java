package co.ho.spex.member.service.impl;

import java.util.List;

import co.ho.spex.member.vo.DeptVo;
import co.ho.spex.member.vo.MemberVo;

public interface MemberMapper {
	List<MemberVo> memberList(MemberVo vo);
	MemberVo memberSelect(MemberVo vo);
	int memberInsert(MemberVo vo);
	int memberUpdate(MemberVo vo);
	int memberDelete(MemberVo vo);
	void deptIns(DeptVo vo);
}
