package co.ho.ex3.member.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.ho.ex3.member.vo.MemberVo;

@Repository("dao")
public class MemberDao implements MemberService {
	
	@Autowired
	private DataSource dataSource;
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	private final String MEMBERLIST="SELECT * FROM MEMBER";
	
	@Override
	public ArrayList<MemberVo> selectAll() {
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		MemberVo vo;
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(MEMBERLIST);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new MemberVo();
				vo.setMemberId(rs.getString("memberid"));
				vo.setMemberAuth(rs.getString("memberauth"));
				vo.setMemberName(rs.getString("membername"));
				vo.setMemberPoint(rs.getInt("memberpoint"));
				list.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list;
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

	private void close() {
		// TODO Auto-generated method stub
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
