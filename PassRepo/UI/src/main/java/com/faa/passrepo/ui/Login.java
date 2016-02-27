package com.faa.passrepo.ui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by solsu01 on 2/10/2016.
 */
public class Login extends JFrame{
    JPanel LoginPanel;

    public Login() {
        setTitle("Password Repository");
        setSize(300, 200);
        setLocation(10, 200);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.LoginPanel = new LoginPanel();
        add(LoginPanel);

        //Window Listeners
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



        setVisible(true);

    }
}
