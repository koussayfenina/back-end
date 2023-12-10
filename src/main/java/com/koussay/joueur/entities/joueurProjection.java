package com.koussay.joueur.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomjo", types = {joueur.class })
public interface joueurProjection {
	public String getNomjoueur();

}
