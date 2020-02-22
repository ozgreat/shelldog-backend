package com.group4.int20h.controller;

import com.group4.int20h.domain.User;
import com.group4.int20h.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractRestController<User, UserService> {
  public UserController(UserService service) {
    super(service);
  }

  @PostMapping("login")
  public User login(@RequestBody User user) {
    return service.validate(user);
  }
}
