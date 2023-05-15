package olcay.devss.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import olcay.devss.business.abstracts.TechnologyService;
import olcay.devss.business.requests.CreateTechnologyRequest;
import olcay.devss.business.responses.GetAllTechnologiesResponse;
import olcay.devss.entities.concretes.Technology;



@RestController
@RequestMapping("/api/technology")
@CrossOrigin
@AllArgsConstructor
public class TechnologiesController {
	
	private TechnologyService technologyService;
	
	@GetMapping()
	public List<GetAllTechnologiesResponse> getAll(){
		return technologyService.getAll();
	}
	
	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		this.technologyService.add(createTechnologyRequest);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.technologyService.delete(id);
	
	}
	
	
	
	
	

}
