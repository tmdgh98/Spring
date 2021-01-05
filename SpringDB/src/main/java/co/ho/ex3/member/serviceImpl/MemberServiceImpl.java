package co.ho.ex3.member.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ho.ex3.member.service.MemberDao;
import co.ho.ex3.member.service.MemberService;
import co.ho.ex3.member.vo.MemberVo;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;
	
	
	@Override
	public ArrayList<MemberVo> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public MemberVo select(MemberVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
