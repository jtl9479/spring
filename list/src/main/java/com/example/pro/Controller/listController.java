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

import com.example.pro.Service.listService;
import com.example.pro.Vo.listVo;

@Controller
public class listController {

	@Autowired
	listService listService;
	
	
	@RequestMapping("index")
	public String index() {
		return "/index";
	}
	
	@GetMapping("list")
	public String list(@RequestParam (defaultValue = "1") int page ,
			@RequestParam (defaultValue = "all") String category,
			@RequestParam (defaultValue = "")  String searchword,
			Model model) {
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map = listService.list(page,category,searchword);
		
		
		model.addAttribute("map", map);
		
		return "/list";
	}
	
	
	@PostMapping("list")
	public String listSearch(@RequestParam (defaultValue = "1") int page ,
			@RequestParam String category,
			@RequestParam String searchword,
			Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map = listService.listserach(page,category,searchword);
		
		
		model.addAttribute("map", map);
		
		return "/list";
	}
}
