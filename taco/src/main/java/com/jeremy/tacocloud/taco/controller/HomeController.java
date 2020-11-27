package com.jeremy.tacocloud.taco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Zhang Dingjie
 * @date 2020/11/10
 * @Description
 */

@Controller
public class HomeController {


	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
