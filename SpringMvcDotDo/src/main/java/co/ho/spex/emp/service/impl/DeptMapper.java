package co.ho.spex.emp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import co.ho.spex.emp.vo.DeptVo;


@Repository
public interface DeptMapper {

	public abstract int insert(DeptVo bean);

	public abstract int update(DeptVo bean);

	public abstract int delete(DeptVo bean);

	public abstract DeptVo selectOne(DeptVo bean);

	public abstract List<Map<String, Object>> selectAll(DeptVo bean);
	
	public abstract List<Map<String, Object>> deptEmpCnt();
	

}