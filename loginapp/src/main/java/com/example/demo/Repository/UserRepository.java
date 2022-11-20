package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,String> 
{
//	User findbyUserId(String userId2);
}
