package org.ada.school.apiuser.dto;

import java.util.Date;

public class UserDto
{
    private String name;

    private String email;

    private String lastName;

    private Date createdAt;

    public UserDto()
    {
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getLastName()
    {
        return lastName;
    }
}