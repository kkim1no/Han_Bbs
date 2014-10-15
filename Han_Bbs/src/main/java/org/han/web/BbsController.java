package org.han.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {

	static Logger logger = Logger.getLogger(BbsController.class);
	
	@RequestMapping("/index")
	public void doA(){
		
	}
	
}