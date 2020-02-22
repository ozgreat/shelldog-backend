package com.group4.int20h.repo;

import com.group4.int20h.domain.Dog;
import com.group4.int20h.domain.Organization;
import com.group4.int20h.enumeration.Sex;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DogRepo extends JpaRepository<Dog, UUID> {
  List<Dog> findAllBySex(Sex sex);

  List<Dog> findAllByBreed(String breed);

  List<Dog> findAllByOrganization(Organization organization);

  List<Dog> findAllByOrganization_City(String city);

  List<Dog> findAllByAgeGreaterThanEqual(int age);

  List<Dog> findAllByAgeLessThanEqual(int age);

  List<Dog> findAllByAgeBetween(int ageFrom, int ageTo);

  List<Dog> findAllBySexAndBreed(Sex sex, String breed);

  List<Dog> findAllBySexAndOrganization(Sex sex, Organization organization);

  List<Dog> findAllBySexAndOrganization_City(Sex sex, String city);

  List<Dog> findAllBySexAndAgeGreaterThanEqual(Sex sex, int age);

  List<Dog> findAllBySexAndAgeLessThanEqual(Sex sex, int age);

  List<Dog> findAllBySexAndAgeBetween(Sex sex, int ageFrom, int ageTo);

  List<Dog> findAllBySexAndBreedAndOrganization(Sex sex, String breed, Organization organization);

  List<Dog> findAllBySexAndBreedAndOrganization_City(Sex sex, String breed, String city);

  List<Dog> findAllBySexAndBreedAndAgeGreaterThanEqual(Sex sex, String breed, int age);

  List<Dog> findAllBySexAndBreedAndAgeIsLessThanEqual(Sex sex, String breed, int age);

  List<Dog> findAllBySexAndBreedAndAgeBetween(Sex sex, String breed, int ageFrom, int ageTo);

  List<Dog> findAllByBreedAndAgeGreaterThanEqual(String breed, int age);

  List<Dog> findAllByBreedAndAgeLessThanEqual(String breed, int age);

  List<Dog> findAllByBreedAndAgeBetween(String breed, int ageFrom, int ageTo);

  List<Dog> findAllByBreedAndOrganization(String breed, Organization organization);

  List<Dog> findAllByBreedAndOrganization_City(String breed, String city);

  List<Dog> findAllByBreedAndOrganizationAndAgeGreaterThanEqual(String breed, Organization organization, int age);

  List<Dog> findAllByBreedAndOrganizationAndAgeLessThanEqual(String breed, Organization organization, int age);

  List<Dog> findAllByBreedAndOrganizationAndAgeBetween(String breed, Organization organization, int ageFrom, int ageTo);

  List<Dog> findAllByBreedAndOrganization_CityAndAgeGreaterThanEqual(String breed, String city, int age);

  List<Dog> findAllByBreedAndOrganization_CityAndAgeLessThanEqual(String breed, String city, int age);

  List<Dog> findAllByBreedAndOrganization_CityAndAgeBetween(String breed, String city, int ageFrom, int ageTo);

  List<Dog> findAllBySexAndBreedAndOrganizationAndAgeGreaterThanEqual(Sex sex, String breed, Organization organization,
                                                                      int age);

  List<Dog> findAllBySexAndBreedAndOrganizationAndAgeLessThanEqual(Sex sex, String breed, Organization organization,
                                                                   int age);

  List<Dog> findAllBySexAndBreedAndOrganizationAndAgeBetween(Sex sex, String breed, Organization organization,
                                                             int ageFrom, int ageTo);

  List<Dog> findAllBySexAndBreedAndOrganization_CityAndAgeGreaterThanEqual(Sex sex, String breed, String city, int age);

  List<Dog> findAllBySexAndBreedAndOrganization_CityAndAgeLessThanEqual(Sex sex, String breed, String city, int age);

  List<Dog> findAllBySexAndBreedAndOrganization_CityAndAgeBetween(Sex sex, String breed, String city, int ageFrom,
                                                                  int ageTo);
}
