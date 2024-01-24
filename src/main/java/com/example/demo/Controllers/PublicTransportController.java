package com.example.demo.Controllers;


import com.example.demo.domains.PublicTransport;
import com.example.demo.domains.city;
import com.example.demo.services.PublicTransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
    public class PublicTransportController {
    @Autowired
    private PublicTransportService PublicTransportservice;

    @PostMapping("/PublicTransport/addPublicTransport")
    public @ResponseBody PublicTransport addPublicTransport(@RequestBody PublicTransport c)
    {
        return PublicTransportService.addPublicTransport(c);
    }

}
