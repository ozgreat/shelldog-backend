package com.group4.int20h.controller;

import com.group4.int20h.domain.Post;
import com.group4.int20h.service.PostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/post"))
public class PostController extends AbstractRestController<Post, PostService> {
  public PostController(PostService service) {
    super(service);
  }
}
