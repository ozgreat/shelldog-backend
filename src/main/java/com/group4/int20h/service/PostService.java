package com.group4.int20h.service;

import com.group4.int20h.domain.Post;
import com.group4.int20h.repo.PostRepo;
import org.springframework.stereotype.Service;

@Service
public class PostService extends AbstractCrudService<Post, PostRepo> {
  public PostService(PostRepo repo) {
    super(repo);
  }
}
