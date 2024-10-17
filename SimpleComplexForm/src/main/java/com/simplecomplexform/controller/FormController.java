package com.simplecomplexform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplecomplexform.entity.Student;

@Controller
public class FormController {
	
	@RequestMapping("/complex")
	public String showForm() 
	{
		return"complex_form";
	}
	//this is your first way
	//jis form ko aapne ko handel karana hai uss ka name yaha per dena hai return ma 
	//@RequestMapping(path="/handelform",method=RequestMethod.POST)
	//public String formhandel(@RequestParam("name")String name,@RequestParam("id")long id) {
		
	//	System.out.println(name);
	//	System.out.println(id);
	//	return"success"; //aap ne ju action ma  name diya hai wo aap key form ju aap @RequestMapping("")  karayaga bus aapko action ma ju name 
		          //diya hai ussko RequestMapping("") karana hai
		//aager aapko from ko handel karna hai tu input field ka name dekhalu tu waha per hai mera name tu 
		  //iss ko ma kise used karunga bus mughe aapne controller ma ja kar method key aander used karna hai 
		 // @RequestParam ab hamara form handel hu jayega 
	//}
	
	 //@RequestMapping(path="/handelform",method=RequestMethod.POST)
	 //public String formHandel(@ModelAttribute("student")Student student,) {  //auto banding used karne ka main purpose hai ki ham chate hai hamre(complex_form.jsp)form ka data direct store hu jaye hamre student key object ma  
		                                                                          //auto banding key liye ham used karte hai @ModelAttribute iss matlab ham aapne data ko banding kar rahe aaur wo data hai 
		    // System.out.println("this is my form data"+student);                                                                //mera Student entity aaur iss ko banding kar rahe aapne controller ma ju ham data pass kiye hai aapne entity key aander wo direct store hu mera console per 
		    // System.out.println("this is your student"+student.getAddress());
		     
		// return"success";
	// }
	 @RequestMapping(path="/handelform",method=RequestMethod.POST)
	 public String formHandel(@ModelAttribute("student")Student student,BindingResult result) {  //auto banding used karne ka main purpose hai ki ham chate hai hamre(complex_form.jsp)form ka data direct store hu jaye hamre student key object ma  
		         
		       //here aager error aaya tu check karna hai 
		        if(result.hasErrors()) {
		        	
		        	return"complex_form";
		        }
		                                                                                            //yaha per ju ham BindingResult method  ka used kiya hai wo kiya hai ki ham na long key ander string pass kiya hai jis key wajaha sa error aaraha BindingException ussko resolved karne key liye  
		      System.out.println(" this is my form data "+student);                                                                
		     System.out.println(" this is your student "+student.getAddress());
		     
		 return"success";
	 }

}
