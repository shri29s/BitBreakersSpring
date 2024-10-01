package com.bitbreakers.bitbreaker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitbreakers.bitbreaker.models.Startup;

@Repository
public interface StartupRepo extends JpaRepository<Startup, Integer> {
}
