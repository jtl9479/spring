package com.example.pro.Service;

import java.util.Map;

import com.example.pro.Vo.eventVo;

public interface event01service {

	//리스트 뽑기
	Map<String, Object> list();

	//뷰화면
	Map<String, Object> selectOneList(int bid);


	//댓글 등록
	Map<String, Object> insertReply(eventVo eventVo);

}
