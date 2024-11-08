 package com.hibernateFiles.mockito_example;

import java.util.ArrayList;
import java.util.List;

public class ToDoBussinessImp {

	private ToDoService todoService;
	public ToDoBussinessImp(ToDoService todoService) {
		this.todoService=todoService; 
	}
	public List<String>retriveToDoRelatedToSpring(String user){
		
		List<String>fileterdToDos=new ArrayList<String>();
		List<String>Todos=todoService.retriveTodos(user);
		for(String todo:Todos) {
			if(todo.contains("Spring")){
					fileterdToDos.add(todo);
		}}
		return fileterdToDos;
		
	}
}
