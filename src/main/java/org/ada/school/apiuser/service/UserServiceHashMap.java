package org.ada.school.apiuser.service;

import org.ada.school.apiuser.dto.UserDto;
import org.ada.school.apiuser.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService
{

    private final HashMap<String, User> usersMap = new HashMap<String, User>();


    @Override
    public User create(User user) {
        usersMap.put( user.getId(), user );
        return user;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public User update(UserDto userDto, String id) {
        return null;
    }
}