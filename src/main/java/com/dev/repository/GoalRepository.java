package com.dev.repository;

import java.util.List;

import com.dev.model.Goal;

public interface GoalRepository {
	Goal save(Goal goal);

	List<Goal> loadAll();

}
