package olcay.devss.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import olcay.devss.business.abstracts.TechnologyService;
import olcay.devss.business.requests.CreateTechnologyRequest;
import olcay.devss.business.responses.GetAllTechnologiesResponse;
import olcay.devss.core.utilities.mappers.ModelMapperService;
import olcay.devss.dataAccess.abstracts.TechnologyRepository;
import olcay.devss.entities.concretes.Technology;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService{
	
	private TechnologyRepository technologyRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllTechnologiesResponse > getAll() {
		
		List<Technology> technologies = technologyRepository.findAll();
		
		List<GetAllTechnologiesResponse> technologyResponses = technologies.stream() 
				.map(technology->this.modelMapperService.forResponse()
						.map(technology, GetAllTechnologiesResponse.class)).collect(Collectors.toList());
		
		return technologyResponses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) { 
		
		Technology technology = this.modelMapperService.forRequest().map(createTechnologyRequest, Technology.class);
		
		this.technologyRepository.save(technology);
		
	}

	@Override
	public void delete(int id) {
		this.technologyRepository.deleteById(id);
		
	}

}
