package com.java.store.admin.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  long id;

    @Column(name = "name", nullable = false)
    public String firstName;

    @Column(name = "surname")
    public String lastName;

    @Column(name = "email")
    public String email;

}
