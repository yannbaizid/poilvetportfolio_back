package fr.yannbaizid.payveportfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yannbaizid.payveportfolio.bo.Image;
import fr.yannbaizid.payveportfolio.services.ImageService;

@RestController()
@RequestMapping("/img")
public class ImageController {

	@Autowired
	ImageService imageService;

	
	@CrossOrigin
	public List<Image> allImages() {
		return imageService.findAll();
	}
}
