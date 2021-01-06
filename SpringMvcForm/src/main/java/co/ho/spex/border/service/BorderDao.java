package co.ho.spex.border.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.ho.spex.border.vo.BorderVo;

// @Repository("borderDao") // setter에 의한 주입방법(인잭션)은 어노테이션이 없어도 된다.
public class BorderDao implements BorderService {
	private DataSource dataSource;
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	private String SELECTLIST = "SELECT * FROM BORDER ORDER BY 1";
	private String INSERT = "INSERT INTO BORDER(BORDERID, BORDERWRITER, BORDERTITLE, BORDERCONTENT) VALUES(?,?,?,?)";
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public ArrayList<BorderVo> selectList() {
		ArrayList<BorderVo> list = new ArrayList<BorderVo>();
		BorderVo vo;
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(SELECTLIST);
			rs= psmt.executeQuery();
			while(rs.next()) {
				vo = new BorderVo();
				vo.setBorderId(rs.getInt(1));
				vo.setBorderWriter(rs.getString(2));
				vo.setBorderTitle(rs.getString(3));
				vo.setBorderContent(rs.getString(4));
				vo.setBorderDate(rs.getDate(5));
				vo.setBorderHit(rs.getInt(6));
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
	public BorderVo select(BorderVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BorderVo vo) {
		int n = 0;
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(INSERT);
			psmt.setInt(1, vo.getBorderId());
			psmt.setString(2, vo.getBorderWriter());
			psmt.setString(3, vo.getBorderTitle());
			psmt.setString(4, vo.getBorderContent());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public int update(BorderVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(BorderVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	private void close(){
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
