package com.example.pro.Mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.pro.Vo.listVo;

@Mapper
public interface listMapper {

	//리스트
	ArrayList<listVo> list(int startrow, int endrow, String category, String searchword);
	//게시물 총 갯수
	int listCount(String category, String searchword);
	//검색 리스트 수
	int listserachCount(String category, String searchword);
	//검색
	ArrayList<listVo> listserach(int startrow, int endrow, String category, String searchword);

}
