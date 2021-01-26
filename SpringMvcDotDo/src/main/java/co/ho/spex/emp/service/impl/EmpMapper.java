package co.ho.spex.emp.service.impl;

import java.util.List;

import co.ho.spex.emp.vo.DeptVo;
import co.ho.spex.emp.vo.EmpVo;
import co.ho.spex.emp.vo.JobVo;

public interface EmpMapper {
	public EmpVo getEmp(EmpVo vo);
	public List<DeptVo> getDept();
	public List<JobVo> getJob();
}
