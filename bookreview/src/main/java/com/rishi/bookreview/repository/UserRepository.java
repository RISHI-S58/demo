package com.rishi.bookreview.repository;

import com.rishi.bookreview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    
}
