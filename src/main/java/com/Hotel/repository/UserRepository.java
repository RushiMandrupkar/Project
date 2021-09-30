package com.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Hotel.entity.*;

//find by email
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findByEmail(String email);
}
