package com.iris.SpringController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.iris.SpringmvcModel.Login;

@Controller
public class FormController {
	@RequestMapping(value="/index.htm", method = RequestMethod.GET)
	public ModelAndView country(){
		 System.out.println(" IRIS Log : Login Controller : GET" ); 
		return new ModelAndView("loginPage","login",new Login());
	}

  
   
   

@RequestMapping(value="validatelogin.htm", method = RequestMethod.POST)
public String saveLogin(@ModelAttribute("loginValidation") Login loginValidate, ModelMap model) {
	
	 System.out.println(" IRIS Log : Login Controller : POST" ); 
	model.addAttribute("suserId", loginValidate.getuserId());
	model.addAttribute("spassword", loginValidate.getpassword());
	model.addAttribute("sname", loginValidate.getname());
	model.addAttribute("sgender", loginValidate.getGender());
	model.addAttribute("scourse", loginValidate.getCourse());
	return "details";
}	
   }

