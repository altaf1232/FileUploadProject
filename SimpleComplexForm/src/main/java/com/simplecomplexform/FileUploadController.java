package com.simplecomplexform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {

		return "fileform";
	}

	@RequestMapping(value = "uploadimage")
	public ModelAndView fileUpload(@RequestParam("profile") CommonsMultipartFile file) {

		ModelAndView modelAndView = new ModelAndView();
		try {

			System.out.println("fileUpload Handler");
			System.out.println(file.getContentType());
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getStorageDescription());
			System.out.println(file.getName());
			System.out.println(file.equals(modelAndView));
		} catch (Exception e) {
			e.printStackTrace();
		}
		modelAndView.setViewName("fileUploadSuccess");

		return modelAndView;

	}

}
