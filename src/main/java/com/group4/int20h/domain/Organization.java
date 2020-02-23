package com.group4.int20h.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Organization")
public class Organization implements Item {
  @Id
  @GeneratedValue
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private UUID id;

  private String name;

  private String address;

  private String city;

  private String instagramLink;

  @OneToOne
  private User creator;

  @Column(name = "DESC", columnDefinition = "TEXT")
  private String description;

  public Organization() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getInstagramLink() {
    return instagramLink;
  }

  public void setInstagramLink(String instagramLink) {
    this.instagramLink = instagramLink;
  }

  public User getCreator() {
    return creator;
  }

  public void setCreator(User creator) {
    this.creator = creator;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
