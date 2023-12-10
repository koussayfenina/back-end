package com.koussay.joueur.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.koussay.joueur.entities.Position;
import com.koussay.joueur.repos.PositionRepository;

@RestController
@RequestMapping("/j/pos")
@CrossOrigin("*")

public class PositionRESTController {
	
	@Autowired
	PositionRepository positionRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Position> getAllPosition()
	{
		return positionRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Position getPositionById(@PathVariable("id") Long id) {
		return positionRepository.findById(id).get();
	}


}
