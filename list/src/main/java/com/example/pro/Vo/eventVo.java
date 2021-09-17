package com.example.pro.Vo;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class eventVo {
	
	private int cno;
	private int bid;
	private String id;
	private String cpw;
	private String ccontent;
	private Timestamp cdate;

}
