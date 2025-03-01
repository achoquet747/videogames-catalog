/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.arielpuma.videogames.repository;

import com.arielpuma.videogames.domain.VideoGame;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Ariel
 */
public interface VideoGamesRepository extends JpaRepository<VideoGame, Integer>{
    
    //@Query("select v from VideoGame v order by v.name") //this way is the complete but the next one is the short way
    @Query("from VideoGame v order by v.name")
    List<VideoGame> getAllVideogamesByName();
    
    @Query("from VideoGame v where v.distributor.id = ?1 order by v.name")
    List<VideoGame> getVideogameByDistributor(int distributorId);
    
    List<VideoGame> findByNameContaining(String containing);
}
