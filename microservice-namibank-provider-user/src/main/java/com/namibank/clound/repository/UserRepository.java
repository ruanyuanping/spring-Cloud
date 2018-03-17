package com.namibank.clound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.namibank.clound.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
