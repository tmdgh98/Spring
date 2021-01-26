package co.ho.spex.emp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ho.spex.emp.service.DeptService;
import co.ho.spex.emp.vo.DeptVo;

@Service("deptService")
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	DeptMapper deptDAO;

	@Override
	public List<Map<String, Object>> selectAll(DeptVo beans) {
		System.out.println("service selectAll");
		//int a = 5/0;
		return deptDAO.selectAll(beans);
	}

	@Override
	public DeptVo selectOne(DeptVo beans) {
		return deptDAO.selectOne(beans);
	}

	@Override
	public int insert(DeptVo beans) {
		return deptDAO.insert(beans);
	}

	@Override
	public int update(DeptVo beans) {
		return deptDAO.update(beans);
	}

	@Override
	public int delete(DeptVo beans) {
		return deptDAO.delete(beans);
	}

	@Override
	public List<Map<String, Object>> deptEmpCnt() {
		return  deptDAO.deptEmpCnt();
	}

}
