package com.example.pro.Service;

import java.util.ArrayList;
import java.util.Map;

import com.example.pro.Vo.listVo;

public interface listService {

	//리스트
	Map<String, Object> list(int page, String category, String searchword);

	//리스트 검색
	Map<String, Object> listserach(int page,String category, String searchword);

}
