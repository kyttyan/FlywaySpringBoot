package com.apex.flywaydemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "consultants")
@Data
public class Consultants {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idConsultants;
  private String name;
  private String lastName;
  private int age;
  private int clientId;
}
