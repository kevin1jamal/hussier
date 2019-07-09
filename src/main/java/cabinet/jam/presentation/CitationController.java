package cabinet.jam.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import cabinet.jam.domaine.entities.Citation;

import cabinet.jam.domaine.entities.User;

import cabinet.jam.service.ICitation;
import cabinet.jam.service.Userservice;

@Controller
public class CitationController {
	@Autowired
	private ICitation citationservice;
	
	@Autowired
	private Userservice userService ;
	
	
	@GetMapping("/citation.asp")
	public String afficherlistesommation(@ModelAttribute Citation cit, Model model) {
		
		
		
		//recupere les informations de connection
		final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		final User user = userService.findUserByEmail(auth.getName());
		//recuperation de la liste des sommation
		
		List<Citation> listecitation = citationservice.getallCitation();
		
		Citation citat = new Citation();
		
		
		//enregistrement de la liste des agriculteurs dans le model pour pouvoir la passer à la vue
		model.addAttribute("listecitation", listecitation);
		model.addAttribute("cit", citat);
		model.addAttribute("userconnecton",user.getName() );
			
		return "citation";
	}
	

}
