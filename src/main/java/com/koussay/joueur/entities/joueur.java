package com.koussay.joueur.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class joueur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idjoueur;
	private String nomjoueur;
	private Double prixjoueur;
	private String equipejoueur;
	
	@ManyToOne
	private Position position;
	
	public joueur() {
		super();
	}
	public Long getIdjoueur() {
		return idjoueur;
	}
	public void setIdjoueur(Long idjoueur) {
		this.idjoueur = idjoueur;
	}
	public String getNomjoueur() {
		return nomjoueur;
	}
	public void setNomjoueur(String nomjoueur) {
		this.nomjoueur = nomjoueur;
	}
	public Double getPrixjoueur() {
		return prixjoueur;
	}
	public void setPrixjoueur(Double prixjoueur) {
		this.prixjoueur = prixjoueur;
	}
	public String getEquipejoueur() {
		return equipejoueur;
	}
	public void setEquipejoueur(String equipejoueur) {
		this.equipejoueur = equipejoueur;
	}
	public joueur(String nomjoueur, Double prixjoueur, String equipejoueur) {
		super();
		this.nomjoueur = nomjoueur;
		this.prixjoueur = prixjoueur;
		this.equipejoueur = equipejoueur;
	}
	@Override
	public String toString() {
		return "joueur [idjoueur=" + idjoueur + ", nomjoueur=" + nomjoueur + ", prixjoueur=" + prixjoueur
				+ ", equipejoueur=" + equipejoueur + "]";
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	

}
