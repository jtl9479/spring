package com.example.pro.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pro.Mapper.listMapper;
import com.example.pro.Vo.listVo;

@Service
public class listServiceImpl implements listService {
	
	@Autowired
	listMapper listMapper;

	//리스트
	@Override
	public Map<String, Object> list(int page,String category, String searchword) {

		
		Map<String, Object> map = new HashMap<String, Object>();
		
		ArrayList<listVo> list = new ArrayList<listVo>();

		int listCount =listMapper.listCount(category,searchword);
		System.out.println("카운터값"+listCount);
		
		
		int pageNum = page;
		int pageCount = 5;
		int listNum = 10;
		int MaxPage = ((int)((double)listCount/listNum+0.99));
		int startpage = (((int)((double)pageNum/pageCount+0.99))-1)*pageCount+1; //하단넘버링 첫번째 수
		int endpage = startpage+pageCount-1; //하단넘버링 마지막 수
		if(endpage>MaxPage) endpage=MaxPage; // 
		System.out.println("MaxPage"+MaxPage);
		
		int startrow = (pageNum*listNum)-9;
		int endrow = pageNum*listNum;
		
		
		list = listMapper.list(startrow,endrow,category,searchword);
		
		map.put("list", list);
		map.put("category", category);
		map.put("searchword", searchword);
		map.put("pageNum", pageNum);
		map.put("MaxPage", MaxPage);
		map.put("startpage", startpage);
		map.put("endpage", endpage);
		
		return map;
	}

	
	@Override
	public Map<String, Object> listserach(int page,String category, String searchword) {

		Map<String, Object> map = new HashMap<String, Object>();
		
		ArrayList<listVo> list = new ArrayList<listVo>();

		int listCount =listMapper.listserachCount(category,searchword);
		
		System.out.println("카운터값"+listCount);
		int pageNum = page;
		int pageCount = 5;
		int listNum = 10;
		int MaxPage = ((int)((double)listCount/listNum+0.99));
		int startpage = (((int)((double)pageNum/pageCount+0.99))-1)*pageCount+1; //하단넘버링 첫번째 수
		int endpage = startpage+pageCount-1; //하단넘버링 마지막 수
		if(endpage>MaxPage) endpage=MaxPage; // 
		System.out.println("MaxPage"+MaxPage);
		
		int startrow = (pageNum*listNum)-9;
		int endrow = pageNum*listNum;
		
		
		list = listMapper.listserach(startrow,endrow,category,searchword);
		
		map.put("list", list);
		map.put("category", category);
		map.put("searchword", searchword);
		map.put("pageNum", pageNum);
		map.put("MaxPage", MaxPage);
		map.put("startpage", startpage);
		map.put("endpage", endpage);
		
		return map;
	}

}
