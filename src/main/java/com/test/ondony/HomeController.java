package com.test.ondony;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.ondony.service.UserService;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	UserService userService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public String userList(Locale locale, Model model) {
		
		model. addAttribute("userlist", userService.getUserList());
		
		String[] userlist = new String[2];
		
		userlist[0] = "나연경1";
		userlist[1] = "나연경2";
		
		model.addAttribute("result", userlist );
		
		return "userList";
	}
	
	@RequestMapping(value = "/insertUser", method = RequestMethod.GET)
	public String insertUser(Locale locale, Model model) {
		
		return "insertUser";
	}
	
}
