package com.driven.helloworld.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.driven.helloworld.dto.CarsDTO;

@RestController
@RequestMapping("/cars")
public class CarsController {
  
  @PostMapping
  public void create(@RequestBody CarsDTO req) {
    System.out.println(req.modelo() + " ano " + req.anoModelo());
  }
}
