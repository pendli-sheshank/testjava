package com.enrollement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enrollement.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	public boolean findByEmail(String email);
	// public boolean existByUsername(String username);

}
