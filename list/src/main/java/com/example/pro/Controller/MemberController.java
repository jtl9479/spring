package com.example.pro.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pro.Service.MemberService;
import com.example.pro.Vo.listVo;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping("ajaxdata")
	@ResponseBody //ajax를 사용할때 리턴값이 json형태 구조로 text값이 넘어간다
	public Map<String, Object> ajaxdata() {
			//서비스로 아이디와 네임을 db에 저장후 다시 데이터를 가져온다
		
		Map<String, Object> map = new HashMap<String, Object>();
		ArrayList<listVo> list = new ArrayList<listVo>();
		list = memberService.ajax();
		
		System.out.println(list.size());
		map.put("list", list);
		
		return map;
	}
	
}
