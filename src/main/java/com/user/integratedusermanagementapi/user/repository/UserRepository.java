package com.user.integratedusermanagementapi.user.repository;

import com.user.integratedusermanagementapi.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    User saveUser(User user);
}