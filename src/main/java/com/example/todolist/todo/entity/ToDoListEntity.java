package com.example.todolist.todo.entity;


public class ToDoListEntity {
	Integer id;
	String taskName;
	String summary;
	String description;
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ToDoListEntity(Integer id, String taskName, String summary, String description) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.summary = summary;
		this.description = description;
	}
	public ToDoListEntity() {
		
	}
	
	@Override
	public String toString() {
		return "id:"+this.id+" taskName:"+this.taskName+" Summary:"+this.summary+" Description:"+this.description;
		
	}
}
