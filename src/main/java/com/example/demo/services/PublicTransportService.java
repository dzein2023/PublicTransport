package com.example.demo.services;

import com.example.demo.domains.PublicTransport;

import com.example.demo.repositories.PublicTransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicTransportService<PublicTransport> {

    @Autowired
    private PublicTransportRepository PublicTransportRepository ;


    public static com.example.demo.domains.PublicTransport addPublicTransport(com.example.demo.domains.PublicTransport c) {

        return c;
    }
}
