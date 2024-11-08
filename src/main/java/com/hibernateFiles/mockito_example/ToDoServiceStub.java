package com.hibernateFiles.mockito_example;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {
 
@Override
public List<String> retriveTodos(String user) {
	 
	return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
}
}
