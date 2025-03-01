/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arielpuma.videogames.repository;

import com.arielpuma.videogames.domain.Distributor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ariel
 */
public interface DistributorRepository extends JpaRepository<Distributor, Integer>{
    
}
