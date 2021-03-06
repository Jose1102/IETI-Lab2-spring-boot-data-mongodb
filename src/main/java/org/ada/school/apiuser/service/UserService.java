package org.ada.school.apiuser.service;
import org.ada.school.apiuser.dto.UserDto;
import org.ada.school.apiuser.model.User;

import java.util.List;

public interface UserService
{
    User create( User user );

    User findById( String id );

    List<User> all();

    boolean deleteById( String id );

    User update( UserDto userDto, String id );
}