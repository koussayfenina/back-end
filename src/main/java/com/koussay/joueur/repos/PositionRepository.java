package com.koussay.joueur.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koussay.joueur.entities.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {

}
