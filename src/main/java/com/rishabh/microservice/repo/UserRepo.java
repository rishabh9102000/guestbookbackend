package com.rishabh.microservice.repo;

import com.rishabh.microservice.pojo.Userss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Userss,Integer> {

    Userss findByName(String name);

}
