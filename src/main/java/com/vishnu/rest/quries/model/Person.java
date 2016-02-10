package com.vishnu.rest.quries.model;

public class Person {

  private String firstName;
  private String lastName;
  private int age;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age <= 0) {
      throw new IllegalArgumentException("Age should be postive");
    }
    this.age = age;
  }

}
