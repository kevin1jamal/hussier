package cabinet.jam.service;

import java.util.List;

import cabinet.jam.domaine.entities.Citation;

public interface ICitation {
	public Citation saveCitation(Citation citation);
	public List<Citation> getallCitation();
	public Citation getuneCitationparrrn(String nrr);
	public void supprimercitation(Long id);
	public void creerpdfcitation(Citation cit,String chemin);

}
