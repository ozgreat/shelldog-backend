package com.group4.int20h.service;

import com.group4.int20h.domain.Item;
import com.group4.int20h.exception.ItemNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public abstract class AbstractCrudService<T extends Item, R extends JpaRepository<T, UUID>> {
  protected R repo;

  public AbstractCrudService(R repo) {
    this.repo = repo;
  }

  public List<T> getAll() {
    return repo.findAll();
  }

  public T getById(UUID id) {
    return repo.findById(id).orElseThrow(ItemNotFoundException::new);
  }

  public T save(T item) {
    return repo.save(item);
  }

  public void delete(T item) {
    repo.delete(item);
  }

  public T update(T oldItem, T newItem) {
    BeanUtils.copyProperties(newItem, oldItem, "id");

    return repo.save(oldItem);
  }


}
