package cabinet.jam.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.google.common.collect.Lists;


import cabinet.jam.domaine.entities.User;
import cabinet.jam.dto.RequerantDto;

import cabinet.jam.dto.UserDto;

import cabinet.jam.service.Userservice;



@Controller
public class LoginController {

	
	
	@Autowired
	private Userservice userService;
	
	
	
	
	
	@GetMapping("/creer")
	public String afficherform(Model model) {
		
		UserDto userDto =new UserDto();
		
		model.addAttribute("userDto", userDto);
		
			
		return "enregistrer";
	}
	
	@PostMapping("/creerform")
	public String creerform(@ModelAttribute UserDto userDto, Model model) {
		
		
		
		final User userExistant = userService.findUserByEmail(userDto.getEmail());
		
		if (userExistant != null) {
			
			return "enregistrer";
		}
		else {
			
			User us = new User();
			
			us.setName(userDto.getName());
			us.setLastName(userDto.getLastName());
			us.setEmail(userDto.getEmail());
			us.setPassword(userDto.getPassword());
			 
			//us.setRoles((Set<Role>) roleRepository.findByRole("ADMIN"));
			userService.saveUser(us);
			

		}
		
			
		return "login";
	}
	
	@GetMapping("/connexion")
	public String connexionform(@ModelAttribute RequerantDto requerantDto, Model model) {
		
		
			
		return "login";
	}
	
	@GetMapping("/perdu")
	public String perduform(@ModelAttribute RequerantDto requerantDto, Model model) {
		
		
			return "passeperdu";
		
	}
	
	@PostMapping("/creeraux")
	public String creeraux(@ModelAttribute UserDto userDto, Model model) {
		
		
		
		final User userExistant = userService.findUserByEmail(userDto.getEmail());
		
		if (userExistant != null) {
			
			return "redirect:/auxiliere.asp";
		}
		else {
			
			User us = new User();
			
			us.setName(userDto.getName());
			us.setLastName(userDto.getLastName());
			us.setEmail(userDto.getEmail());
			us.setPassword(userDto.getPassword());
			 
			//us.setRoles((Set<Role>) roleRepository.findByRole("AUX"));
			userService.saveUserAux(us);
			

		}
		
			
		return "redirect:/auxiliere.asp";
	}
	
	@GetMapping("/auxiliere.asp")
	public String afficherlistesommation(@ModelAttribute UserDto userDto, Model model) {
		
		
		
		//recupere les informations de connection
		final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		final User user = userService.findUserByEmail(auth.getName());
		//recuperation de la liste des users
		
		List<User> listesusers = userService.findUserByStatus(2);
		
		//transformation en dto des users
		List<UserDto> listesusersDto = Lists.transform(listesusers, (User input)->new UserDto(input.getEmail(),input.getPassword(),input.getName(),input.getLastName(),input.getActive(),input.getRoles()));
		
		
		//pour ne pas faire circuler l'entité requerant dans le reseau, on mappe la liste d'entité avec celle de DTO pour n'avoir que des requerant DTO( ie sans Id)
		
		//enregistrement de la liste des agriculteurs dans le model pour pouvoir la passer à la vue
		model.addAttribute("listesusersDto", listesusersDto);
		model.addAttribute("userDto", userDto);
		model.addAttribute("userconnecton",user.getName() );
			
		return "auxiliere";
	}
	
	
	@PostMapping("/auxr/{ref}")
	public String updateRequerant(@PathVariable("ref") String ref,UserDto userDto, Model model) {
		
		 //Long j = (Long) id ;


		
		
User us1 = userService.findUserByEmail(ref);

us1.setName(userDto.getName());
us1.setLastName(userDto.getLastName());
us1.setEmail(userDto.getEmail());
us1.setPassword(userDto.getPassword());
 
//us.setRoles((Set<Role>) roleRepository.findByRole("AUX"));
userService.saveUserAux(us1);
		
		
		
		
		
		
	
		return "redirect:/sommation.asp";		
		}
	
}
