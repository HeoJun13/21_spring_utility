package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class TliesController {

	@GetMapping("/content1")
	public String content1() {
		//return "tiles/tilesEx/content1" ; //(before > jsp로 포워딩)
		return "/aaa"; // definition태그의 name속성과 일치(매핑) (after > 조립(tiles)로 포워딩)
	}
	
	@GetMapping("/content2")
	public ModelAndView content2() {
		
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("tiles/tilesEx/content2");  //(before > jsp로 포워딩)
		mv.setViewName("/bbb"); // (after > 조립(tiles)로 포워딩) definition태그의 name속성과 일치(매핑)
		
		return mv;
	}
	@GetMapping("/content3")
	public ModelAndView content3() {
		//return new ModelAndView("tiles/tilesEx/content3"); //(before > jsp로 포워딩)
		return new ModelAndView("/ccc"); //  (after > 조립(tiles)로 포워딩) definition태그의 name속성과 일치(매핑)
		
	}
 	
 }
