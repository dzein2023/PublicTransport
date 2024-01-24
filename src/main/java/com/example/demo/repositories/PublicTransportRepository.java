package com.example.demo.repositories;
import com.example.demo.domains.PublicTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface PublicTransportRepository {

    @RequestMapping("api/PublicTransport")
    @RestController
    public interface PublicTransport extends JpaRepository<PublicTransport, Long> {

    }

}
