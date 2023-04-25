package olcay.devss.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import olcay.devss.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {
	
	

}
