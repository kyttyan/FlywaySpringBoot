package com.apex.flywaydemo.model;

import javax.persistence.Column;
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
  private Integer idConsultants;
  @Column
  private String name;
  @Column
  private String lastName;
  @Column
  private int age;
  @Column
  private int clientId;
}
