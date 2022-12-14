package com.ant.ops.controller;

import com.ant.ops.entity.SoftwareHouse;
import com.ant.ops.repository.SoftwareHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class SoftwareHouseController {
    @Autowired
    SoftwareHouseRepository softwareHouseRepository;

    @GetMapping("/allSH")
    public List<SoftwareHouse> getAll(){
        return softwareHouseRepository.findAll();
    }

    @PostMapping("/addHouse")
    public SoftwareHouse add(@RequestBody SoftwareHouse softwareHouse){
        return softwareHouseRepository.save(softwareHouse);
    }
}
