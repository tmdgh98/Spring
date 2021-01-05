package co.ho.ex3.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoTest {
	@Autowired
	private DataSource dataSource;
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	//String sql = "select * from member";
	String sql = "select membername from member where memberid='hong'";
	
	public void run() {
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
	}
}
