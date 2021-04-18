package com.springbootsecurityjwt.repository;

import com.springbootsecurityjwt.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Integer> {

    public MyUser findByUserName(String userName);
}
