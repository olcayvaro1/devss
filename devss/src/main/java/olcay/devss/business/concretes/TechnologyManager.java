package olcay.devss.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import olcay.devss.business.abstracts.TechnologyService;
import olcay.devss.dataAccess.abstracts.TechnologyRepository;
import olcay.devss.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{
	
	private TechnologyRepository technologyRespository;

	public TechnologyManager(TechnologyRepository technologyRespository) {
		super();
		this.technologyRespository = technologyRespository;
	}

	@Override
	public List<Technology> getAll() {
		
		return technologyRespository.findAll();
	}

}
