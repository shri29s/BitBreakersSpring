package com.bitbreakers.bitbreaker.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StartupModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String name;
    String address;
    String email;


    public StartupModel() {
    }

    public StartupModel(int id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StartupModel id(int id) {
        setId(id);
        return this;
    }

    public StartupModel name(String name) {
        setName(name);
        return this;
    }

    public StartupModel address(String address) {
        setAddress(address);
        return this;
    }

    public StartupModel email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StartupModel)) {
            return false;
        }
        StartupModel startupModel = (StartupModel) o;
        return id == startupModel.id && Objects.equals(name, startupModel.name) && Objects.equals(address, startupModel.address) && Objects.equals(email, startupModel.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, email);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
    
}
