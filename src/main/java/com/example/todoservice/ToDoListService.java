package com.example.todoservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todolist.todo.entity.ToDoListEntity;

@Service
public class ToDoListService {
	private List<ToDoListEntity> list = new ArrayList<>(Arrays.asList(new ToDoListEntity(1,"task 1","task 1 Summary", "task 1 description"),
																	  new ToDoListEntity(2,"task 2","task 2 Summary", "task 2 description"),
																	  new ToDoListEntity(3,"task 3","task 3 Summary", "task 3 description")));

	public List<ToDoListEntity> getList() {
		return list;
	}
	
	public ToDoListEntity getTask(Integer id) {
		return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTask(ToDoListEntity task) {
		list.add(task);
	}
	
	public void deleteTask(Integer id) {
		list.removeIf(t -> t.getId().equals(id));
	}

	public void update(ToDoListEntity todo, Integer id) {
		// TODO Auto-generated method stub
		int index=0;
		for(ToDoListEntity todos:list) {
			System.out.println(todos);
			if(todos.getId().equals(id)) {
				list.set(index, todo);
			}
			index++;
		}
	}
}
