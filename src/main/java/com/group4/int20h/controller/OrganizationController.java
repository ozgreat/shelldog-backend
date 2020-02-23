package com.group4.int20h.controller;

import com.group4.int20h.domain.Organization;
import com.group4.int20h.enumeration.Role;
import com.group4.int20h.service.OrganizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/organization"))
public class OrganizationController extends AbstractRestController<Organization, OrganizationService> {
  public OrganizationController(OrganizationService service) {
    super(service);
  }

  @GetMapping("city")
  public List<Organization> listFromCity(@RequestParam("name") String city) {
    return service.getAllFromCity(city);
  }

  @PostMapping("create")
  @Override
  public Organization add(Organization item) {
    if (item.getCreator().getRole() != Role.ORGANIZER) {
      item.getCreator().setRole(Role.ORGANIZER);
    }
    return super.add(item);
  }
}
