package com.example.pro.Service;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pro.Mapper.listMapper;
import com.example.pro.Vo.Cvo;
import com.example.pro.Vo.boardVo1;
import com.example.pro.Vo.listVo;

@Service
public class listServiceImpl implements listService {
	
	@Autowired
	listMapper listMapper;

	//list
	@Override
	public Map<String, Object> list() {

		Map<String, Object> map = new HashMap<String, Object>();//map객체선언
		ArrayList<boardVo1> list = new ArrayList<boardVo1>(); //객체 배열 선언 여러가지 값을 받기 위해서 사용한다.
		
		
		list = listMapper.list();  
		
		map.put("list", list);
		
		
		return map;
	}

	
	//view
	@Override
	public Map<String, Object> view(int bid) {

		Map<String, Object> map = new HashMap<String, Object>();//map객체선언
		
		boardVo1 boardVo1 = listMapper.view(bid);
		
		map.put("boardVo1", boardVo1);
		
		return map;
	}


	//댓글 스기
	@Override
	public Cvo commentWrite(String cid, String ccoment) {
	
		listMapper.commentWrite(cid,ccoment);
		
		return null;
	}
	
	
	
}
