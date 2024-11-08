package com.UsrerVerification;


public class UserService {
    public boolean verifyUser(User user, String inputPassword) {
        return user != null && user.getPassword().equals(inputPassword);
    }
}
