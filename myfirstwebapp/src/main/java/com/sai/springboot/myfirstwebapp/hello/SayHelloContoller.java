package com.sai.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloContoller {

	@RequestMapping("hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you doing today!";
	}
	
	@RequestMapping("hello-html")
	@ResponseBody
	public String sayHelloHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	

	@RequestMapping("hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}
	
}
