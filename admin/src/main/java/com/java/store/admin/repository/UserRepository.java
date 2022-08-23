package com.java.store.admin.repository;

import com.java.store.admin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    //@Query(value = "Select * from user where name = ?1", nativeQuery = true)
    User findByFirstName(String name);
}
