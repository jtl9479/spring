package com.example.pro.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pro.Service.event01service;
import com.example.pro.Vo.eventVo;

@Controller
public class event01controller {

	@Autowired
	event01service event01service;
	
	Map<String, Object> map = new HashMap<String, Object>();
	
	//리스트
	@RequestMapping("/event/list")
	public String list(Model model) {

		map = event01service.list();
		
		model.addAttribute("map", map);
		
		return "/event/list";
	}

	//뷰 댓글
	@RequestMapping("/event/view")
	public String view(@RequestParam @Nullable int  bid,Model model) {
		
		map = event01service.selectOneList(bid);
		
		model.addAttribute("map", map);
		
		return "/event/view";
	}
	
	//뷰 댓글
	@RequestMapping("/event/replywrite")
	@ResponseBody
	public Map<String, Object> replywrite(eventVo eventVo,Model model) {
		System.out.println("1");
		System.out.println(eventVo.getId());
		System.out.println("2");
		System.out.println(eventVo.getBid());
		
		//1개의 데이터와 갯수를 받아야한다.
		map = event01service.insertReply(eventVo);
		
		model.addAttribute("map", map);
		
		return map;
	}


}
