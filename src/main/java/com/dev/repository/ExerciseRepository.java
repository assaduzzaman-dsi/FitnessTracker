package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long>{
	
}
