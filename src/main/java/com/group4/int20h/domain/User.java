package com.group4.int20h.domain;

import com.group4.int20h.enumeration.Role;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "Usr")
public class User implements Item {
  @Id
  @GeneratedValue
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private UUID id;

  private String email;

  private Role role;

  private String avatarUrl;

  private String password;

  private String firstName;

  private String lastName;

  public User() {
    avatarUrl = "https://i.imgur.com/i39NX96.png";
    role = Role.USER;
  }

  public User(String email, Role role, String password, String firstName, String lastName, String avatarUrl) {
    this.email = email;
    this.role = role;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.avatarUrl = avatarUrl;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }
}
