package olcay.devss.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import olcay.devss.business.abstracts.TechnologyService;
import olcay.devss.entities.concretes.Technology;



@RestController
@RequestMapping("/api/technology")
@CrossOrigin
public class TechnologiesController {
	
	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService ) {
		this.technologyService = technologyService;

	}
	
	@GetMapping("/getall")
	public List<Technology> getAll(){
		return technologyService.getAll();
	}
	
	

}
