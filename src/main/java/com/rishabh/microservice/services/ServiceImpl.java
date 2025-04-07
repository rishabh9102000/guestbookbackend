package com.rishabh.microservice.services;

import com.rishabh.microservice.pojo.Userss;
import com.rishabh.microservice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class ServiceImpl implements Servicess {

    @Autowired
    UserRepo userRepo;

    @Override
    public Userss addUser(String name, String message) {
        Userss use = new Userss(name,message);
        System.out.println(use);
        return userRepo.save(use);
    }

    @Override
    public Userss getUser(String name) {

        Userss use = userRepo.findByName(name);
        System.out.println(use);
        return use;
    }

    @Override
    public List<Userss> getAll() {
        return  userRepo.findAll();
    }
}
