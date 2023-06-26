package com.brigelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-z][a-z]{3,}");
        Matcher m = p.matcher("Sanyukta");
        boolean result = m.matches();
        System.out.println(result);
    }
}