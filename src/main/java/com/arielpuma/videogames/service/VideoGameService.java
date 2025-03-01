/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arielpuma.videogames.service;

import com.arielpuma.videogames.domain.VideoGame;
import com.arielpuma.videogames.repository.VideoGamesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ariel
 */

@Service
public class VideoGameService {
    
    
    private VideoGamesRepository videoGamesRepository;
    
    @Autowired
    public VideoGameService(VideoGamesRepository videoGamesRepository) {
        this.videoGamesRepository = videoGamesRepository;
    }
    
    public List<VideoGame> searchPopularGames() {
        // we will reaplce with a new implementation retruning by name
        // return videoGamesRepository.findAll();
        return videoGamesRepository.getAllVideogamesByName();
    }
    
    public List<VideoGame> searchVideogameByDistributor(int distributorId) {
        return videoGamesRepository.getVideogameByDistributor(distributorId);
    }
    
    public List<VideoGame> searchVideogameByContaining(String containing) {
        return videoGamesRepository.findByNameContaining(containing);
    }
    
    public VideoGame saveVideogame(VideoGame videogame) {
        return videoGamesRepository.save(videogame);
    }
}
