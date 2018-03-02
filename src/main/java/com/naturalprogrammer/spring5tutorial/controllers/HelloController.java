package com.naturalprogrammer.spring5tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.naturalprogrammer.spring5tutorial.utils.MyUtils;

@Controller
public class HelloController {
	
//	@Autowired
//	private MessageSource messageSource;
	

	@RequestMapping("/hello")
	public String hello(Model model) {
		
//		Object[] urls = {
//				"http://below18.example.com",
//				"http://above18.example.com"};

		model.addAttribute("name", 
//				messageSource.getMessage("text",urls, LocaleContextHolder.getLocale()));
				MyUtils.getMessage("text", "http://below18.example.com",
						                   "http://above18.example.com"));
				
		return "hello";
	}
/* Lo mismo, pero de otra manera 
	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		ModelAndView mav = new ModelAndView("hello");// the logical view name
        mav.addObject("name","Pedritito");
		
		return mav;
*/
	
	@RequestMapping("/hello/{id}")
	public String helloId(Model model, 
			@PathVariable int id,
			@RequestParam(required=false) String name){
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
				
		return "hello-id";
	}

}