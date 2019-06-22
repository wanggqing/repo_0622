package maven_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class BookController {
	@Autowired
	private BookService service;
	
	@RequestMapping("/findAll.do")
	public String findAll() {
	
		return "welcome";
	}
}
