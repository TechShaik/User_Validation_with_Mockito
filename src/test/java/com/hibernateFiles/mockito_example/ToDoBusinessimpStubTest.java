package com.hibernateFiles.mockito_example;

 
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ToDoBusinessimpStubTest {
     
	@Test
	public void testRetriveUsingStub() {
		  ToDoService toDoService=new ToDoServiceStub();
	 ToDoBussinessImp toDobussinessImp=new ToDoBussinessImp(toDoService);
	 
	 List<String> filteredTodos=toDobussinessImp.retriveToDoRelatedToSpring("Dummy");
	 
	 assertEquals(2, filteredTodos.size());
	}
}
