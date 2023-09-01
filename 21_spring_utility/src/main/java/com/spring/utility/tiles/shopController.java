package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shop")
public class shopController {
	
	@GetMapping("/details")
	public String details() {
		return "/shop/details";
	}
	@GetMapping("/cantact")
	public ModelAndView cantact() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/cantact");
		return mv;
	}

}
