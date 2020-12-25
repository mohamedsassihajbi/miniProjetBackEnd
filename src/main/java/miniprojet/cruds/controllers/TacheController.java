package miniprojet.cruds.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import miniprojet.cruds.entities.Tache;
import miniprojet.cruds.services.TacheService;




@CrossOrigin("*")
@RestController()
public class TacheController {
	
	
	@RequestMapping(value = "/ajouterTache",method = { RequestMethod.POST ,RequestMethod.GET})
	public Tache ajouterTache(@RequestBody Tache tache) {
		return TacheService.ajouterTache(tache);
	}
	
	@RequestMapping(value = "/taches",method = RequestMethod.GET)
	public List <Tache> taches(){
		return TacheService.getAllTaches();
	}
	
	@RequestMapping(value = "/tacheById/{id}",method = RequestMethod.GET)
	public Tache tacheById(@PathVariable Long id){
		return TacheService.tacheById(id);
	}
	
	@CrossOrigin( allowedHeaders = "*" )
	@RequestMapping(value = "/modifierTache/{id}",method = { RequestMethod.PATCH , RequestMethod.GET } )
	public Tache modifierFormation( @PathVariable Long id , @RequestBody Tache t) { 
		
		return TacheService.modifierTache(id, t) ;
	}
	
	@RequestMapping(value="/supprimerTahce/{id}",method= {RequestMethod.DELETE , RequestMethod.GET})
	public boolean supprimerTache(@PathVariable Long id){
		TacheService.supprimerTache(id);
		return true;
	}
	
}
