package cabinet.jam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cabinet.jam.domaine.entities.Citation;
import cabinet.jam.repository.CitationRepository;

@Service
public class CitationImpl implements ICitation {
	
	@Autowired
	CitationRepository citRepo;

	@Override
	public Citation saveCitation(Citation citation) {
		// module d'enregistrement
		
		return citRepo.save(citation);
	}

	@Override
	public List<Citation> getallCitation() {
		// revoie la liste des citation
		return citRepo.findAll();
	}

	@Override
	public Citation getuneCitationparrrn(String nrr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimercitation(Long id) {
		// suppression d'une citation
		citRepo.deleteById(id);
		
	}

	@Override
	public void creerpdfcitation(Citation cit, String chemin) {
		// TODO Auto-generated method stub
		
	}

}
