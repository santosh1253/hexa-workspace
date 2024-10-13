package com.guru.files;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@RequestMapping("/display")
	public String display()
	{
		return "Welcome";
	}
}
