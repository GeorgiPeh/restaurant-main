package com.project.restaurant.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Clients")
public class Client
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int    id;
  @NotNull
  @Column(name = "name", unique = true)
  private String name;
  @NotNull
  private String type;

  public Client()
  {
  }

  public Client(int id, String name, String type)
  {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  @Override
  public String toString()
  {
    return "Client{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", type='" + type + '\'' +
        '}';
  }
}
