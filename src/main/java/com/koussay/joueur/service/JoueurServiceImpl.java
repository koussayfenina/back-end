package com.koussay.joueur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koussay.joueur.entities.Position;
import com.koussay.joueur.entities.joueur;
import com.koussay.joueur.repos.joueurRepository;

@Service
public class JoueurServiceImpl implements JoueurService {
	
	@Autowired
	joueurRepository joueurRepository;

	@Override
	public joueur savejoueur(joueur j) {
		return joueurRepository.save(j);
	}

	@Override
	public joueur updatejoueur(joueur j) {
		return joueurRepository.save(j);
	}

	@Override
	public void deletejoueur(joueur j) {
		joueurRepository.delete(j);
		
	}

	@Override
	public void deletejoueurById(Long id) {
		joueurRepository.deleteById(id);
		
	}

	@Override
	public joueur getjoueur(Long id) {
		return joueurRepository.findById(id).get();		
	}

	@Override
	public List<joueur> getAlljoueurs() {
		
		return joueurRepository.findAll();
	}

	@Override
	public List<joueur> findByNomjoueur(String nom) {
		return joueurRepository.findByNomjoueur(nom);
	}

	@Override
	public List<joueur> findByNomjoueurContains(String nom) {
		return joueurRepository.findByNomjoueurContains(nom);
	}

	@Override
	public List<joueur> findByNomPrix(String nom, Double prix) {
		return joueurRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<joueur> findByPosition(Position position) {
		return joueurRepository.findByPosition(position);
	}

	@Override
	public List<joueur> findByPositionIdCat(Long id) {
		return joueurRepository.findByPositionIdCat(id);
	}

	@Override
	public List<joueur> findByOrderByNomjoueurAsc() {
		return joueurRepository.findByOrderByNomjoueurAsc();
	}

	@Override
	public List<joueur> trierJoueursNomsPrix() {
		return joueurRepository.trierJoueursNomsPrix();	}

}
