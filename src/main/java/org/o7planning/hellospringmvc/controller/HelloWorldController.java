package org.o7planning.hellospringmvc.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="where", defaultValue="Current Page") String where) {

    	if(!where.equals("Current Page"))
    		model.addAttribute("greeting", where);
    	else
    		model.addAttribute("greeting", "Hello Spring MVC");
        
        return "helloworld";
        
    }
 
}