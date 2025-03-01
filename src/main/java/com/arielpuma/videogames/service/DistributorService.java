/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arielpuma.videogames.service;

import com.arielpuma.videogames.domain.Distributor;
import com.arielpuma.videogames.repository.DistributorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ariel
 */

@Service
public class DistributorService {
    
    private DistributorRepository distributorRepository;
    
    @Autowired
    public DistributorService(DistributorRepository distributorRepository) {
        this.distributorRepository = distributorRepository;
    }
    
    public List<Distributor> getAllDistributor() {
        return distributorRepository.findAll();
    }
}
