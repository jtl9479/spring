package com.example.pro.Service;

import java.util.ArrayList;
import java.util.Map;

import com.example.pro.Vo.Cvo;
import com.example.pro.Vo.listVo;

public interface listService {


	//리스츠
	Map<String, Object> list();

	//view
	Map<String, Object> view(int bid);

	//댓글쓰기
	Cvo commentWrite(String cid, String ccoment);

	
}
