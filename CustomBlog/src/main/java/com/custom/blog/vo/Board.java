package com.custom.blog.vo;

import lombok.Data;

@Data
public class Board {
	private int boardnum;
	private String menu_name;
	private String title;
	private String text;
	private int hitcount;
	private String regdate;
	private String originalfile;
	private String savedfile;
}
