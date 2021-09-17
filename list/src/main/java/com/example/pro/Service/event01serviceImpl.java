package com.example.pro.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pro.Mapper.eventmapper;
import com.example.pro.Vo.boardVo1;
import com.example.pro.Vo.eventVo;

@Service
public class event01serviceImpl implements event01service {

	
	@Autowired
	eventmapper eventmapper;
	
	//이벤트 리스트
	@Override
	public Map<String, Object> list() {

		Map<String, Object> map = new HashMap<String, Object>();
		ArrayList<boardVo1> list = new ArrayList<boardVo1>();
		
		String startrow= "1";
		String endrow = "10";
		
		list = eventmapper.list(startrow,endrow);
		
		map.put("list", list);
		
		return map;
	}

	//게시판 1개 보기
	@Override
	public Map<String, Object> selectOneList(int bid) {

		Map<String, Object> map = new HashMap<String, Object>();
		
		boardVo1 boardVo1 = new boardVo1();
		//조회수 1증가
		eventmapper.selectOnehit(bid);//들고 올 필요가 없다
		//리스트 1개 가져오기
		boardVo1 = eventmapper.selectOneList(bid);
		//하단 댓글
		ArrayList<eventVo> replylist = eventmapper.selectReplyAll(bid);
		//해당 댓글 카운트
		int count = 0;
		count = eventmapper.selectReplyCount(bid);
		
		System.out.println(count);
		
		map.put("boardVo1", boardVo1);
		map.put("replylist", replylist);
		map.put("count", count);
		
		return map;
	}


	
	@Override
	public Map<String, Object> insertReply(eventVo eventVo) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		//댓글저장ㅈ
		eventmapper.insertReply(eventVo);
		//댓글가져오기
		eventVo = eventmapper.selectReplyOne(eventVo.getCno());
		//댓글 갯수
		int replyCount = eventmapper.selectReplyCount1(eventVo);
		
		map.put("EventVo", eventVo);
		map.put("replyCount", replyCount);
		
		
		return map;
	}

}
