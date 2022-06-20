package com.apex.flywaydemo.rest;

import com.apex.flywaydemo.model.Clients;
import com.apex.flywaydemo.model.Consultants;
import com.apex.flywaydemo.service.ClientsService;
import com.apex.flywaydemo.service.ConsultantsService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Apex {

  private ClientsService clientsService;
  private ConsultantsService consultantsService;

  public Apex(ClientsService clientsService, ConsultantsService consultantsService){
    this.clientsService = clientsService;
    this.consultantsService = consultantsService;
  }

  @GetMapping("clients")
  public List<Clients> getClients(){
    return clientsService.getAllClients();
  }

  @GetMapping("consultants")
  public List<Consultants> getConsultants(){
    return consultantsService.getAllConsultants();
  }
}
