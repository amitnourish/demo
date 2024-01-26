package com.springboot.basicsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.basicsecurity.model.Role;

import java.util.Map;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
