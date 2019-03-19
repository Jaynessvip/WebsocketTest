package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Page {
	@RequestMapping("page")
	public String page() {
		return "NewFile";
	}
}
