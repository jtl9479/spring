package com.example.pro.Vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class listVo {

	private int b_num;
	private String title;
	private String b_content;
	private String b_date;
	private String id;
	private String b_file;
	private int hit;
	
	
	
}
