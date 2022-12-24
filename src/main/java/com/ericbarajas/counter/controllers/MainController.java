package com.ericbarajas.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("num") == null) {
			session.setAttribute("num", 0); 
		}
	    else {
	        session.setAttribute("num", (Integer)session.getAttribute("num")+1);
	    }
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String show() {
	    return "counter.jsp";
	}

}
