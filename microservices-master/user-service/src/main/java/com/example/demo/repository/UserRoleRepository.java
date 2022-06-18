package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
	UserRole findUserRoleByRoleName(String roleName);
}