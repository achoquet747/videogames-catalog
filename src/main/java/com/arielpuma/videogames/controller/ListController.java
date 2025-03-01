package com.arielpuma.videogames.controller;

import com.arielpuma.videogames.domain.VideoGame;
import com.arielpuma.videogames.service.VideoGameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Ariel
 */

@Controller
public class ListController {
    
    private VideoGameService videoGameService;
    @Autowired
    public ListController(VideoGameService videoGameService) {
        this.videoGameService = videoGameService;
    }
    
    
    @RequestMapping("/")
    public String videogamesList(Model model) {
        List<VideoGame> popular = videoGameService.searchPopularGames();
        model.addAttribute("videoGames", popular);
        return "list";
    }
    
    @RequestMapping("/videogameByDistributor")
    public String videogamesByDistributor(int distributorId, Model model) {
        List<VideoGame> gamesByDistributor = videoGameService.searchVideogameByDistributor(distributorId);
        model.addAttribute("videoGames", gamesByDistributor);
        return "list";
    }
    
    @RequestMapping("/search")
    public String videogamesByContaining(@RequestParam("q") String containing, Model model) {
        List<VideoGame> gamesByContaining = videoGameService.searchVideogameByContaining(containing);
        model.addAttribute("videoGames", gamesByContaining);
        return "list";
    }
}
