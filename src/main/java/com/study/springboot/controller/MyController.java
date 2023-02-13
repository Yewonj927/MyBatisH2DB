package com.study.springboot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.springboot.jdbc.Board;
import com.study.springboot.jdbc.BoardMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MyController {

	final BoardMapper boardMapper;
	
	@GetMapping("/test1")
	public void ex1(Model mm) {
		List<Board> list = boardMapper.findAll();
		mm.addAttribute("ddd", list);
	}
	
	@GetMapping("/test2")
	public String ex2(Model ss) {
		ss.addAttribute("ddd", "테스트");
		return "test1"; }
	
}
