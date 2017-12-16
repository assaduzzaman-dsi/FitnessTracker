package com.dev.repository;

import java.util.List;

import com.dev.model.Goal;
import com.dev.model.GoalReport;

public interface GoalRepository {
	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();

}
