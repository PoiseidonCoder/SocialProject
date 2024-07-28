package com.MyProjectMVT_BE.repository;

import com.MyProjectMVT_BE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String value);
    @Query("SELECT u FROM User u WHERE u.firstName LIKE %:value% OR u.lastName LIKE %:value% OR u.email LIKE %:value%")
    public List<User> searchUser(@Param("value") String value);
}
