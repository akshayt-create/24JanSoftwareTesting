package controlFlowStatements;

import javax.swing.*;

public class NestedIfElse {
    static void main(String[] args) {
        //if username is correct--> please enter password
            //if password is correct--> login success--> inbox
            //else password is incorrect--> please check your Password
        //else username is incorrect--> please check username

        String username = "akshay";
        String password = "akshay@123";

        //if(username == "akshay" && password == "akshay@123"){}
        if (username == "akshay") {
            System.out.println("Username is correct, please enter password");

            if (password == "akshay@123") {
                System.out.println("Password is correct, login successful");
            } else {
                System.out.println("Password is incorrect, login failed");
            }

        } else {
            System.out.println("Username is incorrect");
        }

    }
}
