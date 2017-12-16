package com.dev.service;

import java.util.List;

import com.dev.model.Activity;
import com.dev.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}