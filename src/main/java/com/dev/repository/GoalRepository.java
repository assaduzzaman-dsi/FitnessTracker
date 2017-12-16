package com.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.model.Goal;
import com.dev.model.GoalReport;

@Repository("goalRepository")
public interface GoalRepository extends JpaRepository<Goal, Long> {
	
	@Query("Select new com.dev.model.GoalReport(g.minutes, e.minutes, e.activity) " +
			"from Goal g, Exercise e where g.id = e.goal.id")
	List<GoalReport> findAllGoalReports();
	
}
