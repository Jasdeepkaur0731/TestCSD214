package com.example.testcsd214;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public TextField usernameField;

    @FXML
    public TextField passwordField;
    public Label welcomeText;


    int c = 0;

    @FXML
    private void onHelloButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        welcomeText.setText("");


        if (username.equals("") || password.equals("")) {
            welcomeText.setText("Please Provide Username and Password");
        } else {
            if (username.equals("Jasdeep") && password.equals("123")) {
                welcomeText.setText("Success");
            } else {
                if (c >= 5) {
                    welcomeText.setText("Account Locked");
                } else {
                    c=c+1;
                    welcomeText.setText("Sorry, Invalid Username or Password");
                }
            }
        }
    }
}
