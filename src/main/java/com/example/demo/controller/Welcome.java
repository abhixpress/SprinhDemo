package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Welcome {

	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String hi()
	{
		return "Hi Abhinav shankar,How are you?";
}
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome(@RequestParam(value="myname") String Name)
	{
		return "Welcome" +Name;
}
}
