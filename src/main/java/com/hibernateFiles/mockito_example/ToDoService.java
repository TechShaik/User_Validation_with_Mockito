package com.hibernateFiles.mockito_example;

import java.util.List;
//create todoservice stub
public interface ToDoService {
 
	public List<String> retriveTodos(String user);
	
}
