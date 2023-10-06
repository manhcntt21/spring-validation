package com.example.springvalidation.repository;

import com.example.springvalidation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author manhdt14
 * created in 10/6/2023 7:30 AM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
