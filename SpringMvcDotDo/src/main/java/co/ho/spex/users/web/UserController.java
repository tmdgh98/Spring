package co.ho.spex.users.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.ho.spex.users.service.UserService;
import co.ho.spex.users.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired UserService userService;
	
	//등록
	@RequestMapping(value = "/users.do", method = RequestMethod.POST )
	@ResponseBody
	public UserVO insertUser(UserVO vo) {
		userService.insertUser(vo);
		return vo;
	}
	//수정
	@RequestMapping(value = "/users.do", method = RequestMethod.PUT )
	@ResponseBody
	public UserVO updateUser(@RequestBody UserVO vo) {
		userService.updateUser(vo);
		return vo;
	}
	//삭제
	
//	//단건조회
//	@RequestMapping(value = "/users.do/{id}", method = RequestMethod.GET )
//	@ResponseBody
//	public UserVO getUser(UserVO vo) {
//		
//		return userService.getUser(vo);
//	}
	
	//조회
	@RequestMapping(value = "/users.do", method = RequestMethod.GET )
	@ResponseBody
	public List<UserVO> selectAllUser() {
		
		return userService.getUserList(null);
	}
	
}
