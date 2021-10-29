package com.teamwill.app.test.repository;

import com.teamwill.app.test.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {


    AppUser findByUsername(String username);
}
