package co.ho.spex.member.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.ho.spex.member.vo.MemberVo;

public class MemberRowMapper implements RowMapper<MemberVo> {

	@Override
	public MemberVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		MemberVo vo = new MemberVo();
		vo.setMemberId(rs.getString("memberid"));
		vo.setMemberName(rs.getString("membername"));
		vo.setPassword(rs.getString("password"));
		vo.setMemberAuth(rs.getString("memberauth"));
		vo.setMemberPoint(rs.getInt("memberpoint"));
		return vo;
	}

}
