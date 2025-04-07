package com.rishabh.microservice.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Userss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String message;

    public Userss() {
    }

    public Userss(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Userss{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
