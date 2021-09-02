package org.ada.school.apiuser.service;

import org.ada.school.apiuser.dto.UserDto;
import org.ada.school.apiuser.model.User;
import org.ada.school.apiuser.repository.UserDocument;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class UserServiceHashMap implements UserService
{

    private final HashMap<String, User> usersMap = new HashMap<String, User>();


    @Override
    public UserDocument create(UserDocument user) {
        return null;
    }

    @Override
    public UserDocument findById(String id) {
        return null;
    }

    @Override
    public List<UserDocument> all() {
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public UserDocument update(UserDto userDto, String id) {
        return null;
    }

    @Override
    public List<UserDocument> findUsersWithNameOrLastNameLike(String queryText) {
        return null;
    }

    @Override
    public List<UserDocument> findUsersCreatedAfter(Date startDate) {
        return null;
    }


}