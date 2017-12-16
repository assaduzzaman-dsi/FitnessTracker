package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.model.Goal;
import com.dev.model.GoalReport;
import com.dev.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

	public List<Goal> findAllGoals() {
		return goalRepository.findAll();
	}

	public List<GoalReport> findAllGoalReports() {
		return goalRepository.findAllGoalReports();
	}

}
