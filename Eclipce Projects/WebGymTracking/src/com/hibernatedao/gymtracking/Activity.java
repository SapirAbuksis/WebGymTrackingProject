package com.hibernatedao.gymtracking;

public class Activity {
	
	private int activityId;
	private Long userId;
	private String name;
	private String details;
	private int set;
	private int reps;
	
	public Activity(int activityId,	Long userId, String name, String details, int set, int reps) {
		
		this.activityId = activityId;
		this.userId = userId;
		this.name = name;
		this.details = details;
		this.set = set;
		this.reps = reps;
	}
	
	public Activity(int activityId,String name, String details, int set, int reps) {
		
		this.activityId = activityId;
		this.name = name;
		this.details = details;
		this.set = set;
		this.reps = reps;
	}
	
	public Activity(int activityId,String name, int set, int reps) {
		
		this.activityId = activityId;
		this.name = name;
		this.set = set;
		this.reps = reps;
	}
	
	public Activity(String name, String details, int set, int reps) {
		
		this.name = name;
		this.details = details;
		this.set = set;
		this.reps = reps;
	}
	
	public Activity(String name, int set, int reps) {
		
		this.name = name;
		this.set = set;
		this.reps = reps;
	}
	
	public Activity(){
		super();
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}
	
	@Override
	public String toString() {
		return "[" + activityId + "," + name + "," + details + "," + set + 
				"," + reps;
	}
}
