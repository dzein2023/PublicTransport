package com.example.demo.Controllers;

import com.example.demo.domains.city;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.cityService;
@Controller
@RestController
public class cityController {
   @Autowired
    private cityService cityService;

   @PostMapping("/city/addCity")
    public @ResponseBody city addCity(@RequestBody city c)
    {
        return cityService.addCity(c);
    }
}
