package org.ada.school.apiuser.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserDocument, String>
{
    @Query("{ $or : [{ 'name': /?0/ },{'lastName': /?0/}] }")
    List<UserDocument> findUsersWithNameOrLastNameLike(String queryText);
}
