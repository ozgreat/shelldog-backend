package com.group4.int20h.controller;

import com.group4.int20h.domain.Dog;
import com.group4.int20h.domain.Organization;
import com.group4.int20h.service.DogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController extends AbstractRestController<Dog, DogService> {
  public DogController(DogService service) {
    super(service);
  }


  @GetMapping("org/{id}")
  public List<Dog> listByOrganization(@PathVariable("id") Organization organization) {
    return service.getAllByOrganization(organization);
  }
}