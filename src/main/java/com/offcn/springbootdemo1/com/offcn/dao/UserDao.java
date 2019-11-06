package com.offcn.springbootdemo1.com.offcn.dao;

import com.offcn.springbootdemo1.com.offcn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
