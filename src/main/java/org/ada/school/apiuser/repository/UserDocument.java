package org.ada.school.apiuser.repository;

import org.ada.school.apiuser.dto.UserDto;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document
public class UserDocument
{
    @Id
    private String id;

    private String name;

    @Indexed( unique = true )
    private String email;

    private String lastName;

    private Date createdAt;




    public UserDocument(UserDto userDto)
    {
        name = userDto.getName();
        email = userDto.getEmail();
        lastName = userDto.getLastName();
        createdAt = userDto.getCreatedAt();

    }

    public UserDocument() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }


    public void update(UserDto userDto) {

        name = userDto.getName();
        email = userDto.getEmail();
        lastName = userDto.getLastName();
        createdAt = userDto.getCreatedAt();

    }
}