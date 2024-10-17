
package com.simplecomplexform.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SimpleComplexController {

	@RequestMapping("/home")
	public String home() {

		System.out.println("going to home view.....");

		return "home";
	}

	  @RequestMapping("/search") 
	 public RedirectView search(@RequestParam("querybox") String query )   
     {                                                                                                         //data ko nikalane key liye  ham used karte hai @RequestParama //@RequestParama() key aander hamko likhana
                                                                                 //huta hai aapne form field ka name ju diya hai hamare form key ander aaur uss form ka name //home.jsp iss ma hamre form ka name="querybox" iss ko likhan  hai
       String url="https://www.google.com/search?q="+query;
       RedirectView redirectView=new RedirectView(); redirectView.setUrl(url);
       return redirectView; 
     }
}