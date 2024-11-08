package com.hibernateFiles.mockito_example;

 
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

public class ToDoBusinessimpMock {
     
	@Test
	public void testRetriveUsingStub() {
 
		ToDoService mockTodoService=mock(ToDoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");

		when(mockTodoService.retriveTodos("Dummy")).thenReturn(todos);
 	 ToDoBussinessImp toDobussinessImp=new ToDoBussinessImp(mockTodoService);
	 
	 List<String> filteredTodos=toDobussinessImp.retriveToDoRelatedToSpring("Dummy");
	 
	 assertEquals(2, filteredTodos.size());
	}
}
