package co.ho.spex.emp.vo;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class EmpVo {
	 private String employeeId;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private String phoneNumber;
	 private String hireDate;
	 private String jobId;
	 private String salary;
	 private String commissionPct;
	 private String managerId;
	 private String departmentId;
	 private String profile;
	 //private MultipartFile uploadfile;
}
