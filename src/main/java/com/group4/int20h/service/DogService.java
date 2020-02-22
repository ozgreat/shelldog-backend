package com.group4.int20h.service;

import com.group4.int20h.domain.Dog;
import com.group4.int20h.domain.Organization;
import com.group4.int20h.enumeration.Sex;
import com.group4.int20h.repo.DogRepo;

import java.util.List;

public class DogService extends AbstractCrudService<Dog, DogRepo> {
  public DogService(DogRepo repo) {
    super(repo);
  }

  public List<Dog> getAllBySex(Sex sex) {
    return repo.findAllBySex(sex);
  }

  public List<Dog> getAllByBreed(String breed) {
    return repo.findAllByBreed(breed);
  }

  public List<Dog> getAllByOrganization(Organization organization) {
    return repo.findAllByOrganization(organization);
  }

  public List<Dog> getAllByOrganization_City(String city) {
    return repo.findAllByOrganization_City(city);
  }

  public List<Dog> getAllByAgeGreaterThanEqual(int age) {
    return repo.findAllByAgeGreaterThanEqual(age);
  }

  public List<Dog> getAllByAgeLessThanEqual(int age) {
    return repo.findAllByAgeLessThanEqual(age);
  }

  public List<Dog> getAllByAgeBetween(int ageFrom, int ageTo) {
    return repo.findAllByAgeBetween(ageFrom, ageTo);
  }

  public List<Dog> getAllBySexAndBreed(Sex sex, String breed) {
    return repo.findAllBySexAndBreed(sex, breed);
  }

  public List<Dog> getAllBySexAndOrganization(Sex sex, Organization organization) {
    return repo.findAllBySexAndOrganization(sex, organization);
  }

  public List<Dog> getAllBySexAndOrganization_City(Sex sex, String city) {
    return repo.findAllBySexAndOrganization_City(sex, city);
  }

  public List<Dog> getAllBySexAndAgeGreaterThanEqual(Sex sex, int age) {
    return repo.findAllBySexAndAgeGreaterThanEqual(sex, age);
  }

  public List<Dog> getAllBySexAndAgeLessThanEqual(Sex sex, int age) {
    return repo.findAllBySexAndAgeLessThanEqual(sex, age);
  }

  public List<Dog> getAllBySexAndAgeBetween(Sex sex, int ageFrom, int ageTo) {
    return repo.findAllBySexAndAgeBetween(sex, ageFrom, ageTo);
  }

  public List<Dog> getAllBySexAndBreedAndOrganization(Sex sex, String breed, Organization organization) {
    return repo.findAllBySexAndBreedAndOrganization(sex, breed, organization);
  }

  public List<Dog> getAllBySexAndBreedAndOrganization_City(Sex sex, String breed, String city) {
    return repo.findAllBySexAndBreedAndOrganization_City(sex, breed, city);
  }

  public List<Dog> getAllBySexAndBreedAndAgeGreaterThanEqual(Sex sex, String breed, int age) {
    return repo.findAllBySexAndBreedAndAgeGreaterThanEqual(sex, breed, age);
  }

  public List<Dog> getAllBySexAndBreedAndAgeIsLessThanEqual(Sex sex, String breed, int age) {
    return repo.findAllBySexAndBreedAndAgeIsLessThanEqual(sex, breed, age);
  }

  public List<Dog> getAllBySexAndBreedAndAgeBetween(Sex sex, String breed, int ageFrom, int ageTo) {
    return repo.findAllBySexAndBreedAndAgeBetween(sex, breed, ageFrom, ageTo);
  }

  public List<Dog> getAllByBreedAndAgeGreaterThanEqual(String breed, int age) {
    return repo.findAllByBreedAndAgeGreaterThanEqual(breed, age);
  }

  public List<Dog> getAllByBreedAndAgeLessThanEqual(String breed, int age) {
    return repo.findAllByBreedAndAgeLessThanEqual(breed, age);
  }

  public List<Dog> getAllByBreedAndAgeBetween(String breed, int ageFrom, int ageTo) {
    return repo.findAllByBreedAndAgeBetween(breed, ageFrom, ageTo);
  }

  public List<Dog> getAllByBreedAndOrganization(String breed, Organization organization) {
    return repo.findAllByBreedAndOrganization(breed, organization);
  }

  public List<Dog> getAllByBreedAndOrganization_City(String breed, String city) {
    return repo.findAllByBreedAndOrganization_City(breed, city);
  }

  public List<Dog> getAllByBreedAndOrganizationAndAgeGreaterThanEqual(String breed, Organization organization, int age) {
    return repo.findAllByBreedAndOrganizationAndAgeGreaterThanEqual(breed, organization, age);
  }

  public List<Dog> getAllByBreedAndOrganizationAndAgeLessThanEqual(String breed, Organization organization, int age) {
    return repo.findAllByBreedAndOrganizationAndAgeLessThanEqual(breed, organization, age);
  }

  public List<Dog> getAllByBreedAndOrganizationAndAgeBetween(String breed, Organization organization, int ageFrom, int ageTo) {
    return repo.findAllByBreedAndOrganizationAndAgeBetween(breed, organization, ageFrom, ageTo);
  }

  public List<Dog> getAllByBreedAndOrganization_CityAndAgeGreaterThanEqual(String breed, String city, int age) {
    return repo.findAllByBreedAndOrganization_CityAndAgeGreaterThanEqual(breed, city, age);
  }

  public List<Dog> getAllByBreedAndOrganization_CityAndAgeLessThanEqual(String breed, String city, int age) {
    return repo.findAllByBreedAndOrganization_CityAndAgeLessThanEqual(breed, city, age);
  }

  public List<Dog> getAllByBreedAndOrganization_CityAndAgeBetween(String breed, String city, int ageFrom, int ageTo) {
    return repo.findAllByBreedAndOrganization_CityAndAgeBetween(breed, city, ageFrom, ageTo);
  }

  public List<Dog> getAllBySexAndBreedAndOrganizationAndAgeGreaterThanEqual(Sex sex, String breed, Organization organization,
                                                                            int age) {
    return repo.findAllBySexAndBreedAndOrganizationAndAgeGreaterThanEqual(sex, breed, organization, age);
  }

  public List<Dog> getAllBySexAndBreedAndOrganizationAndAgeLessThanEqual(Sex sex, String breed, Organization organization,
                                                                         int age) {
    return repo.findAllBySexAndBreedAndOrganizationAndAgeLessThanEqual(sex, breed, organization, age);
  }

  public List<Dog> getAllBySexAndBreedAndOrganizationAndAgeBetween(Sex sex, String breed, Organization organization,
                                                                   int ageFrom, int ageTo) {
    return repo.findAllBySexAndBreedAndOrganizationAndAgeBetween(sex, breed, organization, ageFrom, ageTo);
  }

  public List<Dog> getAllBySexAndBreedAndOrganization_CityAndAgeGreaterThanEqual(Sex sex, String breed, String city,
                                                                                 int age){
    return repo.findAllBySexAndBreedAndOrganization_CityAndAgeGreaterThanEqual(sex, breed, city, age);
  }

  public List<Dog> getAllBySexAndBreedAndOrganization_CityAndAgeLessThanEqual(Sex sex, String breed, String city,
                                                                              int age){
    return repo.findAllBySexAndBreedAndOrganization_CityAndAgeLessThanEqual(sex, breed, city, age);
  }

  public List<Dog> getAllBySexAndBreedAndOrganization_CityAndAgeBetween(Sex sex, String breed, String city, int ageFrom,
                                                                        int ageTo){
    return repo.findAllBySexAndBreedAndOrganization_CityAndAgeBetween(sex, breed, city, ageFrom, ageTo)
  }
}
