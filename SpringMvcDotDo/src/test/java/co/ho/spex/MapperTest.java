package co.ho.spex;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.ho.spex.member.service.impl.MemberMapper;
import co.ho.spex.member.vo.DeptVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:datasource-context.xml")
public class MapperTest {
	@Autowired MemberMapper dao;
	
	@Test
	public void insTest() {
		DeptVo vo = new DeptVo();
		vo.setDepartmentName("회계");
		dao.deptIns(vo);
		assertEquals(vo.getOutMsg(),"SUCCESS");
	}
	
}
