package com.group4.int20h.repo;

import com.group4.int20h.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrganizationRepo extends JpaRepository<Organization, UUID> {
  List<Organization> findAllByCity(String city);
}
