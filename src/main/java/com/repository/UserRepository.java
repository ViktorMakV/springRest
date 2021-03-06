package com.repository;

import com.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User getDistinctFirstByFirstNameOrderByIdDesc(String firstName);
}
