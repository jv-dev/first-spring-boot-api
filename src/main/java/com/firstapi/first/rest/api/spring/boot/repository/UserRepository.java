package com.firstapi.first.rest.api.spring.boot.repository;

import com.firstapi.first.rest.api.spring.boot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
