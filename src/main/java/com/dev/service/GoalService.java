package com.dev.service;

import java.util.List;

import com.dev.model.Goal;

public interface GoalService {
	Goal save(Goal goal);

	List<Goal> findAllGoals();
}
