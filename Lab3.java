package com.company;

import java.util.Scanner;
import java.util.regex.*;

public class Lab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date: ");
        String date = sc.nextLine();
        for (int i = 0; i < date.length(); i++) {
            if (!(Character.isDigit(date.charAt(i)) || date.charAt(i) == '/')) {
                System.out.println("Error.");
                return;
            }
        }
        String range = "((0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[012])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9]))";
        Pattern p = Pattern.compile(range);
        Matcher m = p.matcher(date);
        boolean m1 = m.matches();
        if (m1) {
            System.out.println("The date is entered correctly.");
        } else {
            System.out.println("Date entered incorrectly.");
        }
        sc.close();
    }
}