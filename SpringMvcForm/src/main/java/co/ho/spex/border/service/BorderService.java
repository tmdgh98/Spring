package co.ho.spex.border.service;

import java.util.ArrayList;

import co.ho.spex.border.vo.BorderVo;

public interface BorderService {
	ArrayList<BorderVo> selectList(); //전체리스트 가져오기
	BorderVo select(BorderVo vo); 	  //하나의 레코드 가져오기
	int insert(BorderVo vo); 		  // 레코스 삽입
	int update(BorderVo vo); 		  // 레코드 수정
	int delete(BorderVo vo); 		  // 레코드 삭제	
}
