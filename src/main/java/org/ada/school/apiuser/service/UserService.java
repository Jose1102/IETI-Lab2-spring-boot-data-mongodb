package org.ada.school.apiuser.service;
import org.ada.school.apiuser.dto.UserDto;
import org.ada.school.apiuser.model.User;
import org.ada.school.apiuser.repository.UserDocument;

import java.util.Date;
import java.util.List;

public interface UserService
{
    UserDocument create(UserDocument user );

    UserDocument findById( String id );

    List<UserDocument> all();

    boolean deleteById( String id );

    UserDocument update( UserDto userDto, String id );

    List<UserDocument> findUsersWithNameOrLastNameLike(String queryText);

    List<UserDocument> findUsersCreatedAfter(Date startDate);

}