package cabinet.jam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cabinet.jam.domaine.entities.Citation;

public interface CitationRepository extends JpaRepository<Citation, Long> {
	
	
}
