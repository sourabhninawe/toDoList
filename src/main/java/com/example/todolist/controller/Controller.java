package com.example.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist.todo.entity.ToDoListEntity;
import com.example.todoservice.ToDoListService;

import io.swagger.annotations.Api;

@RestController()
@RequestMapping("/todolist")
@Api(tags="To do list", description = "To do list service")
public class Controller {
	
	@Autowired
	private ToDoListService toDoListService;
	
	@RequestMapping(method = RequestMethod.GET ,value = "/getTasks")
	public List<ToDoListEntity> getAll(){
		 return toDoListService.getList();
	}
	
	@RequestMapping(method = RequestMethod.GET ,value = "/")
	public String hello() {
		return "Hello There!";
	}
	
	@RequestMapping(method = RequestMethod.GET ,value = "/getTask/{id}")
	public ToDoListEntity get(@PathVariable Integer id) {
		return toDoListService.getTask(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/addTask")
	public void addTask(@RequestBody ToDoListEntity todo) {
		toDoListService.addTask(todo);
	}
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public void updateTask(@PathVariable Integer id, @RequestBody ToDoListEntity todo) {
		toDoListService.update(todo,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void deleteTask(@PathVariable Integer id) {
		toDoListService.deleteTask(id);
	}
}
