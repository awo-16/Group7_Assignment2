package com.csis3275.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.csis3275.model.GroupModel;

@Controller
public class GroupController {

	@GetMapping("/")
	public String index(Model model) {

		String groupDescription = "Meet the dynamic trio: Augusta Wood, Ian Kariuki, and Elson Ricafrente, an enterprising team of students from the CSIS3275 Software Engineering course. United by their passion for technology and innovation, they are currently channeling their talents into the Walletguard project. This venture is a personal financial management app designed to revolutionize the way individuals manage and monitor their finances. Augusta brings a keen eye for design and user experience, ensuring the app is not only functional but also intuitive and user-friendly. Ian contributes his expertise in coding and software architecture, turning complex functionalities into seamless experiences. Elson, with his background in IT support and a keen interest in cyber security, ensures the app's reliability and security, safeguarding users' financial data. Together, they embody a blend of creativity, technical skill, and a commitment to developing an app that empowers users to take control of their financial well-being.";
		List<String> images = Arrays.asList("Augusta.png", "Ian.png", "Elson.png");
		GroupModel groupProfile = new GroupModel(images, groupDescription);
		model.addAttribute("groupProfile", groupProfile);
		return "index";
	}
	
	
	  @GetMapping("/bio/{imageName}")
	  public String imageDetails(@PathVariable String imageName, Model model) {

	    return "bio/" + imageName;
	  }
	
}
