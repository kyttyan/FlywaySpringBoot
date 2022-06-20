package com.apex.flywaydemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clients")
@Data
public class Clients {

  @Id
  private Integer idClients;
  @Column
  private String name;
  @Column
  private String email;

}
