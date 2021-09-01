package org.ada.school.apiuser.controller;

import org.ada.school.apiuser.dto.UserDto;
import org.ada.school.apiuser.repository.UserDocument;
import org.apache.el.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.ada.school.apiuser.service.UserService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping( "/user" )
public class UserController
{ 

    private final UserService userService;

    public UserController( @Autowired UserService userService )
    {
        this.userService = userService;
    }

    @GetMapping("/date")
    public ResponseEntity<List<UserDocument>> findUsersCreatedAfter(@RequestParam Date startDate){


        return ResponseEntity.ok(userService.findUsersCreatedAfter(startDate));
    }

    @GetMapping("/search")
    public ResponseEntity<List<UserDocument>> findUsersWithNameOrLastNameLike(@RequestParam String queryText){
        return ResponseEntity.ok( userService.findUsersWithNameOrLastNameLike(queryText));
    }

    @GetMapping
    public ResponseEntity<List<UserDocument>> all()
    {
        return ResponseEntity.ok( userService.all() );
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<UserDocument> findById( @PathVariable String id )
    {
        return ResponseEntity.ok( userService.findById( id ) );
    }


    @PostMapping
    public ResponseEntity<UserDocument> create( @RequestBody UserDto userDto )
    {
        return ResponseEntity.ok( userService.create( new UserDocument( userDto ) ) );
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<UserDocument> update(@RequestBody UserDto userDto, @PathVariable String id )
    {
        return ResponseEntity.ok( userService.update( userDto, id ) );
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        return ResponseEntity.ok( userService.deleteById( id ) );
    }


}