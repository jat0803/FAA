package com.faa.passrepo.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by solsu01 on 2/27/2016.
 */
public class LoginPanel extends JPanel {
    public LoginPanel (){
        super();
        addLoginButton();
    }

    public void addLoginButton(){
        JButton loginButton = new JButton("Login");
        this.add(loginButton, BorderLayout.CENTER);
    }
}
