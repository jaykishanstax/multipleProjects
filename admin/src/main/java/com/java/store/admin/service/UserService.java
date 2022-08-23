package com.java.store.admin.service;

import com.java.store.admin.entity.User;
import com.java.store.admin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
      User data =  userRepository.save(user);
        return data;
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Record not Found"));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(long id, User user) {
        User userData = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Record Not Found"));
        userData.setEmail(user.getEmail());
        userData.setFirstName(user.getFirstName());
        userData.setLastName(user.getLastName());

        return userRepository.save(userData);
    }

    public User deleteUser(long id) {
        User userData = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Record Not found"));
        userRepository.delete(userData);
        return userData;
    }

    public User getUserByName(String name) {
        User userData = userRepository.findByFirstName(name);
        return userData;
    }
}
