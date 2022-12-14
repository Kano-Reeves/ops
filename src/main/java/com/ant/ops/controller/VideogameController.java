package com.ant.ops.controller;

import com.ant.ops.entity.SoftwareHouse;
import com.ant.ops.entity.Videogame;
import com.ant.ops.repository.SoftwareHouseRepository;
import com.ant.ops.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class VideogameController {

    @Autowired
    VideogameRepository videogameRepository;

    @GetMapping("/all")
    public List<Videogame> all(){
        return videogameRepository.findAll();
    }

    @PostMapping("/addGame")
    public Videogame add(@RequestBody Videogame videogame){
        return videogameRepository.save(videogame);
    }

}
