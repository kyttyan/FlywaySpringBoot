package com.apex.flywaydemo.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Apex {

  @GetMapping("")
  public List<String> getClients(){
    return new ArrayList<>();
  }

}
