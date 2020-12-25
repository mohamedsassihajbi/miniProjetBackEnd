package miniprojet.cruds.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import miniprojet.cruds.entities.Tache;

public class TacheService {

	private static Map<Long , Tache> taches = new LinkedHashMap<>();
	private static Long index = (long) 0;
	
	public static List<Tache> getAllTaches(){
		return new ArrayList<>(taches.values());
	}
	
	public static Tache ajouterTache(Tache t) {
		index += 1;
		t.setId(index);
		taches.put(index, t);
		return t;
	}
	
	public static Tache modifierTache(Long id, Tache t) {
		t.setId(id);
		taches.put(id, t);
		return t;
	}
	
	public static Tache supprimerTache(Long id) {
		return taches.remove(id);
	}
	
	public static Tache tacheById(Long id) {
		return taches.get(id);
	}
}
