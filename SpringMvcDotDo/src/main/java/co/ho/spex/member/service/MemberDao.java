package co.ho.spex.member.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.ho.spex.member.vo.MemberVo;

@Repository("memberDao")
public class MemberDao implements MemberService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public ArrayList<MemberVo> memberList() throws SQLException{
		String sql = "select * from member";
				
		return (ArrayList<MemberVo>) jdbcTemplate.query(sql, new MemberRowMapper());
	}

	@Override
	public MemberVo memberSelect(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
//		String sql = "select * from member where memberid = ? and password = ?";
//		Object[] args = {vo.getMemberId(),vo.getPassword()};
//		return jdbcTemplate.queryForObject(sql, args, new MemberRowMapper());
		String sql = "select * from member where memberid = ?";
		Object[] args = {vo.getMemberId()};
		return jdbcTemplate.queryForObject(sql, args, new MemberRowMapper());
	}

	@Override
	public int memberInsert(MemberVo vo) throws SQLException{
		String sql = "INSERT INTO MEMBER(MEMBERID, MEMBERNAME, PASSWORD, MEMBERAUTH) "
				+ "VALUES(?,?,?,?)";
		
		Object[] args = {vo.getMemberId(),vo.getMemberName(),vo.getPassword(),vo.getMemberAuth()};
		return jdbcTemplate.update(sql, args);
	}

	@Override
	public int memberUpdate(MemberVo vo) throws SQLException{
		String sql = "update member set password = ?, memberauth = ? where memberid=?";
		Object[] args = {vo.getPassword(),vo.getMemberAuth(),vo.getMemberId()};
		return jdbcTemplate.update(sql, args);
	}

	@Override
	public int memberDelete(MemberVo vo) throws SQLException{
		String sql = "delete from member where memberid=?";
		
		return jdbcTemplate.update(sql, vo.getMemberId());
	}

	@Override
	public boolean memberLoginCheck(MemberVo vo) throws SQLException{
		boolean check = false;
		String sql = "select count(*) from member where memberid= ? and password = ?";
		Object[] args = {vo.getMemberId(), vo.getPassword()};
		int n = jdbcTemplate.queryForObject(sql, args, Integer.class);
		if(n != 0) check = true;
		return check; 
	}

}
