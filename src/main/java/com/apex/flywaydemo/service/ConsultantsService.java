package com.apex.flywaydemo.service;

import com.apex.flywaydemo.model.Consultants;
import com.apex.flywaydemo.repository.ConsultantsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultantsService {

  @Autowired
  private ConsultantsRepository repository;

  public List<Consultants> getAllConsultants(){
    return repository.findAll();
  }

}
