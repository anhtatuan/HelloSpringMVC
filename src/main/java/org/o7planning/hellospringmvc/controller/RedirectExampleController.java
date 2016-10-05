package org.o7planning.hellospringmvc.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class RedirectExampleController {
 
 @RequestMapping(value = "/redirect", method = RequestMethod.GET)
 public String authorInfo(Model model) {
 
     // Làm gì đó tại đây ...
	 model.addAttribute("where", "You just redirected from \"Redirect Page\"");
 
     return "redirect:/hello";
 }
}