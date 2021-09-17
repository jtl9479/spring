package com.example.pro.Mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.pro.Vo.boardVo1;
import com.example.pro.Vo.listVo;

@Mapper
public interface listMapper {

	//list
	ArrayList<boardVo1> list();

	//view
	boardVo1 view(int bid);

	//쓰기
	void commentWrite(String cid, String ccoment);


}
