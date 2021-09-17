package com.example.pro.Mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.pro.Vo.boardVo1;
import com.example.pro.Vo.eventVo;

@Mapper
public interface eventmapper {

	//리스트
	ArrayList<boardVo1> list(String startrow,String endrow);

	//게시판 1개 출력
	boardVo1 selectOneList(int bid);

	//조회수
	void selectOnehit(int bid);

	//하단 댓글가지고오기
	ArrayList<eventVo> selectReplyAll(int bid);

	//하단 댓글 카운트
	int selectReplyCount(int bid);

	//댓글 입력
	void cwrite(eventVo eventVo);

	//댓글 1개 보여주기
	eventVo replyoneview(int cno);

	//댓글 저장
	void insertReply(eventVo eventVo);

	//댓글 등록 보여주기
	eventVo selectReplyOne(int cno);

	//댓글 카운트
	int selectReplyCount1(eventVo eventVo);

}
