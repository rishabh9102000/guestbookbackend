package com.rishabh.microservice.services;

import com.rishabh.microservice.pojo.Userss;
import com.rishabh.microservice.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component

public class ServiceImpl implements Servicess {

    private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

    @Autowired
    UserRepo userRepo;

    @Override
    public Userss addUser(String name, String message) {
        logger.info("Add user service called");
        Userss use = new Userss(name,message);
        System.out.println(use);
        return userRepo.save(use);
    }

    @Override
    public Userss getUser(String name) {
        logger.info("getUser service called");
        Userss use = userRepo.findByName(name);
        System.out.println(use);
        return use;
    }

    @Override
    public List<Userss> getAll() {
        logger.info("getALL service callled");
        return  userRepo.findAll();
    }
}
