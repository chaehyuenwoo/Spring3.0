package com.exe.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("test.controller")
public class TestController {
	
	/*@RequestMapping(value="/test/param.action", method = RequestMethod.GET)
	public String processGetReqest() {
		
		System.out.println("GET ��� Request");
		
		return "paramResult"; //paramResult.jsp
	}
	
	
	@RequestMapping(value="/test/param.action", method = RequestMethod.POST)
	public String processPostRequest() {
		
		System.out.println("POST ��� Request");
		
		return "paramResult";
	}
	*/
	
	//���� 2���� ��ġ��
	@RequestMapping(value="/test/param.action", 
			method = {RequestMethod.POST,RequestMethod.GET})
	public String processRequest(String name, HttpServletRequest request) {
		
		System.out.println("GET/POST��� Request"); 
		
		System.out.println(name);
		System.out.println(request.getParameter("phone"));
		
		return "paramResult";
	}
}