package com.codewithyoutube.fullstackbackend.repository;

import com.codewithyoutube.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
