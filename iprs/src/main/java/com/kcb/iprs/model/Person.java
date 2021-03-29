package com.kcb.iprs.model;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gendeer;
    private String dateOfBirth;
    private String nationalID;
    private String passportNumber;
    private String alienId;

    public Person() {
    }

    public Person(Long id, String firstName,String middleName, String lastName,String gendeer, String dateOfBirth, String nationalID, String passportNumber, String alienId) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalID = nationalID;
        this.passportNumber = passportNumber;
        this.alienId = alienId;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGendeer() {
        return gendeer;
    }

    public void setGendeer(String gendeer) {
        this.gendeer = gendeer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAlienId() {
        return alienId;
    }

    public void setAlienId(String alienId) {
        this.alienId = alienId;
    }
}
