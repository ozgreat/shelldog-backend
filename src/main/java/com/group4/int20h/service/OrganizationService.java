package com.group4.int20h.service;

import com.group4.int20h.domain.Organization;
import com.group4.int20h.repo.OrganizationRepo;

import java.util.List;

public class OrganizationService extends AbstractCrudService<Organization, OrganizationRepo> {
  public OrganizationService(OrganizationRepo repo) {
    super(repo);
  }

  /**
   * Find all organization from city
   *
   * @param city String, name of city of organization
   * @return List of organization from {@param city}
   */
  public List<Organization> getAllFrom(String city) {
    return repo.findAllByCity(city);
  }
}
