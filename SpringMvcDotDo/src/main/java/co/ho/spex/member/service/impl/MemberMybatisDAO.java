package co.ho.spex.member.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.ho.spex.member.service.MemberService;
import co.ho.spex.member.vo.MemberVo;

//@Repository("memberDao")
public class MemberMybatisDAO implements MemberService{
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public List<MemberVo> memberList(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return sqlSession.selectList("MemberDAO.memberList");
	}

	@Override
	public MemberVo memberSelect(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberInsert(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdate(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean memberLoginCheck(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
