package com.group4.int20h.controller;

import com.group4.int20h.domain.Organization;
import com.group4.int20h.service.OrganizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("organization")
public class OrganizationController extends AbstractRestController<Organization, OrganizationService> {
  public OrganizationController(OrganizationService service) {
    super(service);
  }

  @GetMapping("{city}")
  public List<Organization> listFromCity(@PathVariable("city") String city) {
    return service.getAllFromCity(city);
  }
}
