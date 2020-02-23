package com.group4.int20h.controller;

import com.group4.int20h.domain.Item;
import com.group4.int20h.service.AbstractCrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class AbstractRestController<T extends Item, S extends AbstractCrudService<T, ?>> {
  S service;

  public AbstractRestController(S service) {
    this.service = service;
  }

  @GetMapping
  public List<T> list() {
    return service.getAll();
  }

  @GetMapping("{id}")
  public T getById(@PathVariable("id") T item) {
    return service.getById(item.getId());
  }

  @PutMapping("{id}")
  public T updateItem(@PathVariable("id") T itemFromDb, @RequestBody T item) {
    return service.update(itemFromDb, item);
  }

  @PostMapping
  public T add(@RequestBody T item) {
    return service.save(item);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable("id") UUID item) {
    service.delete(service.getById(item));
  }
}
