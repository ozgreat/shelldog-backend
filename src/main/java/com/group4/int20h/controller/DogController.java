package com.group4.int20h.controller;

import com.group4.int20h.domain.Dog;
import com.group4.int20h.service.DogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dog")
public class DogController extends AbstractRestController<Dog, DogService> {
  public DogController(DogService service) {
    super(service);
  }
}
