package com.group4.int20h.controller;

import com.group4.int20h.domain.Organization;
import com.group4.int20h.domain.User;
import com.group4.int20h.enumeration.Role;
import com.group4.int20h.service.OrganizationService;
import com.group4.int20h.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/organization"))
public class OrganizationController extends AbstractRestController<Organization, OrganizationService> {
  private UserService userService;

  public OrganizationController(OrganizationService service, UserService userService) {
    super(service);
    this.userService = userService;
  }

  @GetMapping("city")
  public List<Organization> listFromCity(@RequestParam("name") String city) {
    return service.getAllFromCity(city);
  }

  @PostMapping("create")
  @Override
  public Organization add(@RequestBody Organization item) {
    if (item.getCreator().getRole() != Role.ORGANIZER) {
      User user = item.getCreator();
      user.setRole(Role.ORGANIZER);
      userService.update(item.getCreator(), user);
      item.setCreator(user);
    }
    return super.add(item);
  }
}
