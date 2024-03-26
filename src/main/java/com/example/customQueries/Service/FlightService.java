package com.example.customQueries.Service;

import com.example.customQueries.Repository.FlightRepository;
import com.example.customQueries.entity.Flight;
import com.example.customQueries.entity.StatusEnum.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class FlightService {
    @Autowired
    public FlightRepository flightRepository;
    public Flight newFlignt(){
        Random random= new Random();
        Flight flight = new Flight();
        flight.setDescription("Description");
        flight.setFromAirport("From Airport" + random.nextInt(100));
        flight.setToAirport("To Airport"+ random.nextInt(100));
        flight.setStatus(StatusEnum.ONTIME);
        return flight;
    }
    public List<Flight> topFlights(){
        ArrayList<Flight> flights=new ArrayList<>();
        IntStream.range(0, 50).forEach(i -> flights.add(newFlignt()));
        return flightRepository.saveAll(flights);
    }
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }
}
