package com.csis3275.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.csis3275.model.GroupModel;<<<<<<<HEAD
import com.csis3275.model.Model_eri_77;=======
import com.csis3275.model.Model_ika_09;>>>>>>>model_ika_09

/**
 * GroupController is a Spring MVC Controller that handles HTTP requests for the
 * group profile and individual member bios. It manages the display of
 * information about a group of students and their individual profiles.
 */
@Controller
public class GroupController {

	/**
	 * Handles the root URL ("/") request and populates the model with group profile
	 * data.
	 * 
	 * @param model The Model object that is used to pass data to the view.
	 * @return The name of the view to be rendered, in this case "index".
	 */
	@GetMapping("/")
	public String index(Model model) {
		String groupDescription = "Meet the dynamic trio: Augusta Wood, Ian Kariuki, and Elson Ricafrente, an enterprising team of students from the CSIS3275 Software Engineering course. United by their passion for technology and innovation, they are currently channeling their talents into the Walletguard project. This venture is a personal financial management app designed to revolutionize the way individuals manage and monitor their finances. Augusta brings a keen eye for design and user experience, ensuring the app is not only functional but also intuitive and user-friendly. Ian contributes his expertise in coding and software architecture, turning complex functionalities into seamless experiences. Elson, with his background in IT support and a keen interest in cyber security, ensures the app's reliability and security, safeguarding users' financial data. Together, they embody a blend of creativity, technical skill, and a commitment to developing an app that empowers users to take control of their financial well-being.";
		List<String> images = Arrays.asList("Augusta", "Ian", "Elson");
		GroupModel groupProfile = new GroupModel(images, groupDescription);
		model.addAttribute("groupProfile", groupProfile);
		return "index";
	}

	@GetMapping("/bio/{imageName}")
	public String imageDetails(@PathVariable String imageName, Model model) {
		switch (imageName) {
		case "Ian":
			Model_ika_09 std = new Model_ika_09();
			model.addAttribute("member", std);
			break;
		}
	}

	/**
	 * Handles requests for individual member bios based on the image name.
	 * Populates the model with member-specific data.
	 *
	 * @param imageName The name of the image/member to fetch the bio for, obtained
	 *                  from the URL path.
	 * @param model     The Model object that is used to pass data to the view.
	 * @return The name of the view to be rendered, which includes the
	 *         member-specific bio.
	 */
	@GetMapping("/bio/{imageName}")
	public String displayMember(@PathVariable String imageName, Model model) {
		String memberDescription = "Hello! I'm Elson Ricafrente, a dedicated IT professional from the Philippines, currently enriching my expertise in cyber security through the PBD Cyber Security program. With a strong foundation in technology, I work as an IT Support Specialist, applying my skills to troubleshoot, maintain, and enhance IT systems. Passionate about staying ahead in the ever-evolving field of information technology, I'm committed to leveraging my knowledge and experience to protect digital assets and infrastructure.";
		Model_eri_77 groupMember = new Model_eri_77(imageName, memberDescription);
		model.addAttribute("groupMember", groupMember);
		return "bio/" + imageName;
	}

}
