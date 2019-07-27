package com.wcs.app.jf.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

	@RequestMapping("/getdata")

		public String m2()
		{
			return "hii";
		}
		
	}


