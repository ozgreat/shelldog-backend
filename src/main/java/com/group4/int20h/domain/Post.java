package com.group4.int20h.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Post")
public class Post implements Item {
  @Id
  @GeneratedValue
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private UUID id;

  @ManyToOne
  private User author;

  private String name;

  private String body;

  private String attachmentLink;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date created;

  public Post() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public String getName() {
    return name;
  }

  public void setName(String title) {
    this.name = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getAttachmentLink() {
    return attachmentLink;
  }

  public void setAttachmentLink(String attachmentLink) {
    this.attachmentLink = attachmentLink;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }
}
