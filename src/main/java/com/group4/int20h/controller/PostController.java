package com.group4.int20h.controller;

import com.group4.int20h.domain.Post;
import com.group4.int20h.service.PostService;

public class PostController extends AbstractRestController<Post, PostService> {
  public PostController(PostService service) {
    super(service);
  }
}
