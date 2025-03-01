/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arielpuma.videogames.controller;

import com.arielpuma.videogames.domain.Distributor;
import com.arielpuma.videogames.domain.VideoGame;
import com.arielpuma.videogames.service.DistributorService;
import com.arielpuma.videogames.service.VideoGameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ariel
 */

@Controller
public class VideogamesAbmController {
    
    private DistributorService distributorService;
    private VideoGameService videogameService;
    
    
    @Autowired
    public VideogamesAbmController(DistributorService distributorService, VideoGameService videogameService) {
        this.distributorService = distributorService;
        this.videogameService = videogameService;
    }
    
    
    @RequestMapping("/videogames/create")
    public String showFormCreateVideogame(Model model) {
        List<Distributor> distributors = distributorService.getAllDistributor();
        model.addAttribute("distributors", distributors);
        model.addAttribute("videogame", new VideoGame());
        return "formVideogame";
    }
    
    @PostMapping("/videogames/save")
    public String saveVideogame(VideoGame videogame) {
        videogameService.saveVideogame(videogame);
        return "redirect:/";
    }
}
