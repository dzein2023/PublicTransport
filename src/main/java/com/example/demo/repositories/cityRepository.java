package com.example.demo.repositories;

import com.example.demo.domains.city;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/city")
@RestController
public interface cityRepository extends JpaRepository<city,Long> {

}
