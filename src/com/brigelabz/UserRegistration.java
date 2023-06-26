package com.brigelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Pattern firstName = Pattern.compile("[A-z][a-z]{3,}");
        Matcher f = firstName.matcher("Sanyukta");
        boolean result = f.matches();
        System.out.println(result);

        Pattern lastName = Pattern.compile("[A-z][a-z]{3,}");
        Matcher l = lastName.matcher("Berad");
        boolean result1 = l.matches();
        System.out.println(result1);
    }
}