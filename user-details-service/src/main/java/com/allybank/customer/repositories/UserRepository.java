package com.allybank.customer.repositories;

import com.allybank.customer.entities.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDomain, Long> {

    /*private final Map<String, User> userMap;

    public UserRepository(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public User getById(String userId) {
        User existingUser = userMap.get(userId);
        if (existingUser == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return existingUser;
    }*/
}
