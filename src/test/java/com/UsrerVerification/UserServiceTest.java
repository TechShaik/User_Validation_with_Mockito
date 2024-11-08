package com.UsrerVerification;
 import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserServiceTest {

     @Test
	public void testVerifyUser_ValidCredentials() {
         UserService userService = new UserService();
        User mockUser = Mockito.mock(User.class);

         Mockito.when(mockUser.getPassword()).thenReturn("password123");

         boolean result = userService.verifyUser(mockUser, "password123");

         assertTrue(result);  
    }

    @Test
    public void testVerifyUser_InvalidCredentials() {
        // Arrange
        UserService userService = new UserService();
        User mockUser = Mockito.mock(User.class);

        // Mocking the behavior of User object
        Mockito.when(mockUser.getPassword()).thenReturn("password123");

        // Act
        boolean result = userService.verifyUser(mockUser, "wrongPassword");

        // Assert
        assertFalse(result); // Check that verification fails for wrong password
    }

    @Test
    public void testVerifyUser_NullUser() {
         UserService userService = new UserService();

         boolean result = userService.verifyUser(null, "password123");

         assertFalse(result); // Check that verification fails when user is null
    }
}
