package com.example.demo.services;

import com.example.demo.domains.city;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.cityRepository;
@Service
public class cityService {
    @Autowired
    private  cityRepository cityRepository;

    public city addCity(city c)
    {
        return cityRepository.save(c);
    }
}
