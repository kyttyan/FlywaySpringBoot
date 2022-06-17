package com.apex.flywaydemo.rest;

import com.apex.flywaydemo.service.ClientsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Apex {

  private ClientsService clientsService;

  public Apex(ClientsService clientsService){
    this.clientsService = clientsService;
  }

  @GetMapping("")
  public List<String> getClients(){
    return new ArrayList<>();
  }

}
