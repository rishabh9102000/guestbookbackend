package com.rishabh.microservice.services;

import com.rishabh.microservice.pojo.Userss;

import java.util.List;

public interface Servicess {
    Userss addUser(String name, String message);
    Userss getUser(String name);
    List<Userss> getAll();
}
