package com.csis3275.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model.GroupModel;

@Controller
public class GroupController {

	@GetMapping("/")
	private String index(Model model) {
		String groupDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Pharetra magna ac placerat vestibulum. Ultrices vitae auctor eu augue ut lectus arcu bibendum. Blandit aliquam etiam erat velit scelerisque in dictum non. Sed arcu non odio euismod lacinia at quis. Malesuada fames ac turpis egestas sed tempus urna et pharetra. Lacus vestibulum sed arcu non. Vitae congue eu consequat ac felis donec et. Sit amet justo donec enim diam vulputate. Quisque sagittis purus sit amet. At auctor urna nunc id cursus metus aliquam.";

		List<String> images = Arrays.asList("Image1", "Image2", "Image3");
		GroupModel groupProfile = new GroupModel(images, groupDescription);
		model.addAttribute("groupProfile", groupProfile);
		return "index";
	}

}
