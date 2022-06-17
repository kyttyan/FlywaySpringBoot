package com.apex.flywaydemo.service;

import com.apex.flywaydemo.model.Clients;
import com.apex.flywaydemo.repository.ClientsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {

  @Autowired
  private ClientsRepository repository;

  public List<Clients> getAllClients(){
    return repository.findAll();
  }

}
