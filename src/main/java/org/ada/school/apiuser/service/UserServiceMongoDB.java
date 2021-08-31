package org.ada.school.apiuser.service;

import org.ada.school.apiuser.dto.UserDto;
import org.ada.school.apiuser.model.User;
import org.ada.school.apiuser.repository.UserDocument;
import org.ada.school.apiuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMongoDB
        implements UserService
{

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {

        this.userRepository = userRepository;
    }


    @Override
    public UserDocument create(UserDocument user) {
        return userRepository.save(user);
    }

    @Override
    public UserDocument findById(String id) {

        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserDocument> all() {

        return userRepository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public UserDocument update(UserDto userDto, String id) {
        return null;
    }
}