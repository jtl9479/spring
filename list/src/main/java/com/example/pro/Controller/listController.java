package com.example.pro.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pro.Service.listService;
import com.example.pro.Vo.Cvo;
import com.example.pro.Vo.listVo;

@Controller
public class listController {

	@Autowired
	listService listService;
	
	
	@GetMapping("index")
	public String index() {
		return "/index";
	}
	
	@PostMapping("index")
	public String index(@RequestParam String m_id,@RequestParam String m_pw) {
		return "/index";
	}
	
	
	@RequestMapping("ajaxtest")
	public String ajaxtest() {
		return "/ajaxtest";
	}
	
	@RequestMapping("ajax1")
	public String ajax1() {
		return "/ajax1";
	}
	
	@PostMapping("ajaxpost")
	@ResponseBody
	public String ajaxpost(@RequestParam String ccoment,
			@RequestParam String cid
			) {
		
		System.out.println("값");
		System.out.println(ccoment);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		listService.commentWrite(cid,ccoment);
		
		map.put("coment", ccoment);
		
		return "map";
	}
	
}
