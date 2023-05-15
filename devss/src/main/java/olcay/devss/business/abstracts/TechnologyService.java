package olcay.devss.business.abstracts;

import java.util.List;

import olcay.devss.business.requests.CreateTechnologyRequest;
import olcay.devss.business.responses.GetAllTechnologiesResponse;


public interface TechnologyService {
	
	List<GetAllTechnologiesResponse> getAll();
	
	void add(CreateTechnologyRequest createTechnologyRequest);
	
	void delete(int id);

}
