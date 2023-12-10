package com.koussay.joueur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.koussay.joueur.entities.Position;
import com.koussay.joueur.entities.joueur;

@RepositoryRestResource(path = "rest")
public interface joueurRepository extends JpaRepository<joueur, Long> {
	
	List<joueur> findByNomjoueur(String nom);
	List<joueur> findByNomjoueurContains(String nom);
	
	/*@Query("select p from joueur p where p.nomjoueur like %?1 and p.prixjoueur > ?2")
	List<joueur> findByNomPrix (String nom, Double prix);*/
	
	@Query("select p from joueur p where p.nomjoueur like %:nom and p.prixjoueur > :prix")
	List<joueur> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	
	@Query("select p from joueur p where p.position = ?1")
	List<joueur> findByPosition (Position position);
	
	List<joueur> findByPositionIdCat(Long id);
	
	List<joueur> findByOrderByNomjoueurAsc();
	
	@Query("select p from joueur p order by p.nomjoueur ASC, p.prixjoueur DESC")
	List<joueur> trierJoueursNomsPrix ();




}
