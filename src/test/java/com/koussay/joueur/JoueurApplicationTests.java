package com.koussay.joueur;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.koussay.joueur.entities.Position;
import com.koussay.joueur.entities.joueur;
import com.koussay.joueur.repos.joueurRepository;

@SpringBootTest
class JoueurApplicationTests {

	@Autowired
	private joueurRepository joueurRepository;
	@Test
	public void testCreateJoueur() {
	joueur j = new joueur("messi",2200.000,"barcalona");
	joueurRepository.save(j);
	}
	
	@Test
	public void testFindJoueur()
	{
	joueur j = joueurRepository.findById(2L).get(); 
	System.out.println(j);
	}
	@Test
	public void testUpdateJoueur()
	{
	joueur j = joueurRepository.findById(2L).get();
	j.setPrixjoueur(4000.0);
	joueurRepository.save(j);
	}
	
	@Test
	public void testDeleteJoueur()
	{
		joueurRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousJoueurs()
	{
	List<joueur> jo = joueurRepository.findAll();
	for (joueur j : jo)
	{
		System.out.println(j);
	}
	}
	@Test
	public void testFindJoueurByNom()
	{
	List <joueur> jo = joueurRepository.findByNomjoueur("messi"); 
	for (joueur j : jo)
	{
		System.out.println(j);
	}
	}
	
	@Test
	public void testFindJoueurByNomContains()
	{
	List <joueur> jo = joueurRepository.findByNomjoueurContains("i"); 
	for (joueur j : jo)
	{
		System.out.println(j);
	}
	}
	
	public void testfindByNomPrix()
	{
	List<joueur> jo = joueurRepository.findByNomPrix("messi", 2000.0);
	for (joueur p : jo)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testfindByPosition()
	{
	Position  pos = new Position ();
	pos.setIdCat(3L);
	List<joueur> jo = joueurRepository.findByPosition(pos);
	for (joueur j : jo)
	{
	System.out.println(j);
	}
	}
	
	@Test
	public void findByPositionIdCat()
	{
	List<joueur> jo = joueurRepository.findByPositionIdCat(3L);
	for (joueur j : jo)
	{
	System.out.println(j);
	}
	 }
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<joueur> jo = joueurRepository.findByOrderByNomjoueurAsc();
	for (joueur j : jo)
	{
	System.out.println(j);
	}
	}
	
	@Test
	public void testTrierJoueursNomsPrix()
	{
	List<joueur> prods = joueurRepository.trierJoueursNomsPrix();
	for (joueur p : prods)
	{
	System.out.println(p);
	}
	}





}
