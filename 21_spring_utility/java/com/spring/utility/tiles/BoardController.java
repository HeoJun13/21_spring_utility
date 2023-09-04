package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@GetMapping("/bList")
	public String bList() {
		return "/bList";
		
	}
	
	@GetMapping("/bUpdate")
	public ModelAndView bUpdate() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/bUpdate");
		return mv;
	}
	
	@GetMapping("/bDelete")
	public ModelAndView bDelete() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/bDelete");
		return mv;
	}
	
	

}
