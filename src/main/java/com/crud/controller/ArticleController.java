package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/article/")
public class ArticleController {
	// 게시판 목록 불러오기
	@GetMapping("/list")
	public void showList() {
	}
}
