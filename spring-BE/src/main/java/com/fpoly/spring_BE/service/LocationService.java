package com.fpoly.spring_BE.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fpoly.spring_BE.model.Location;
import com.fpoly.spring_BE.repository.LocationRepository;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

}
