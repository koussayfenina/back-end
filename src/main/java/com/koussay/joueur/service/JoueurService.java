package com.koussay.joueur.service;

import java.util.List;

import com.koussay.joueur.entities.Position;
import com.koussay.joueur.entities.joueur;

public interface JoueurService {
	joueur savejoueur(joueur j);
	joueur updatejoueur(joueur j);
	void deletejoueur(joueur j);
	 void deletejoueurById(Long id);
	 joueur getjoueur(Long id);
	List<joueur> getAlljoueurs();
	List<joueur> findByNomjoueur(String nom);
	List<joueur> findByNomjoueurContains(String nom);
	List<joueur> findByNomPrix (String nom, Double prix);
	List<joueur> findByPosition (Position position);
	List<joueur> findByPositionIdCat(Long id);
	List<joueur> findByOrderByNomjoueurAsc();
	List<joueur> trierJoueursNomsPrix ();

}
