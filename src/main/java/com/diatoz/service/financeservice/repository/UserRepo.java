package com.diatoz.service.financeservice.repository;

import com.diatoz.service.financeservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
