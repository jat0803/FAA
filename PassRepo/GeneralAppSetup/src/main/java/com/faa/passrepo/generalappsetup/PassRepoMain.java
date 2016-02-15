package com.faa.passrepo.generalappsetup;

import com.faa.passrepo.ui.Login;

/**
 * Created by solsu01 on 2/10/2016.
 */
public class PassRepoMain {
    public static void main (String[] args) {
        System.out.println("Dodo's Conundrum");
        System.out.println("Something significant...it just is.");

        String test = Login.giveMeAString();

        System.out.println("test string from Login class: " + test);

        return;
    }

    public static String test () {
        String answer = "Hi I'm PassRepoMain.test";
        return answer;
    }
}
