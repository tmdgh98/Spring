package co.ho.spex.member.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ho.spex.member.service.MemberService;
import co.ho.spex.member.vo.MemberVo;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper dao;
	
	@Override
	public List<MemberVo> memberList(MemberVo vo) throws SQLException{

		return dao.memberList(vo);
	}

	@Override
	public MemberVo memberSelect(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		return dao.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		return dao.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		return dao.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		return dao.memberDelete(vo);
	}

	@Override
	public boolean memberLoginCheck(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		MemberVo resultvo = dao.memberSelect(vo);
		if(vo != null && vo.getPassword().equals(resultvo.getPassword())) {
			return true;
		}else {
			return false; 
		}
	}

}
