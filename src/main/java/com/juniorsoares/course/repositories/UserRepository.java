package com.juniorsoares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsoares.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
