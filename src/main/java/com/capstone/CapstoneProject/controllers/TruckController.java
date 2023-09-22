package com.capstone.CapstoneProject.controllers;

import com.capstone.CapstoneProject.models.Employee;
import com.capstone.CapstoneProject.models.Truck;
import com.capstone.CapstoneProject.services.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("trucks")
public class TruckController {

    @Autowired
    TruckService truckService;

    @GetMapping
    public ResponseEntity<List<Truck>> getAllTrucks(){
        return new ResponseEntity<>(truckService.getAllTrucks(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Truck> getTruckById(@PathVariable Long id){
        return new ResponseEntity<>(truckService.getTruckById(id).get(), HttpStatus.OK);
    }
}
