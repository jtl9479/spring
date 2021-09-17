package com.example.pro.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pro.Mapper.MemberMapper;
import com.example.pro.Vo.listVo;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Override
	public ArrayList<listVo> ajax() {

		ArrayList<listVo> list = new ArrayList<listVo>();
		
		list = memberMapper.ajax();
		
		return list;
	}
}
