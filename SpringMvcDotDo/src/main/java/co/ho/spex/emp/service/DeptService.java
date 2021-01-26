package co.ho.spex.emp.service;

import java.util.List;
import java.util.Map;

import co.ho.spex.emp.vo.DeptVo;

public interface DeptService {

	//전체조회
	public List<Map<String,Object>> selectAll(DeptVo beans);
	
	//단건조회
	public DeptVo selectOne(DeptVo beans);
	
	//추가
	public int insert(DeptVo beans);
	
	//수정
	public int update(DeptVo beans);
	
	//삭제
	public int delete(DeptVo beans);
	
	//부서별인원수 조회
	public List<Map<String, Object>> deptEmpCnt();
	
}
