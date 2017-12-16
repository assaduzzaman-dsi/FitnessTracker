package com.dev.service;

import java.util.List;

import com.dev.model.Goal;
import com.dev.model.GoalReport;

public interface GoalService {
	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
}
