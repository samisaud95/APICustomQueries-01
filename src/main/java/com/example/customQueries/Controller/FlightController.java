package com.example.customQueries.Controller;

import com.example.customQueries.Service.FlightService;
import com.example.customQueries.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @PostMapping("/newflight")
    private ResponseEntity<List<Flight>> getTopFlight(){
        return ResponseEntity.ok().body(flightService.topFlights());
    }
    @GetMapping("/alllistflights")
    private ResponseEntity<List<Flight>> getAllFlights(){
        return ResponseEntity.ok().body(flightService.getAllFlights());
    }

}
