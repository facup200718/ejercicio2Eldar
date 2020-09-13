package com.ejercicio2Eldar.ejercicio2Eldar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/transactions")
public class RateController {
    private RateService service = new RateService();

    @GetMapping("/{brand}")
    public String read(@PathVariable String brand,@PathVariable Float amount) {
        return service.calculateRate(brand, amount);
    }
}
