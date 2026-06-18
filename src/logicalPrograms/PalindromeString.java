package logicalPrograms;

import java.sql.SQLOutput;

public class PalindromeString {
    static void main(String[] args) {
        //MOM DAD RADAR NITIN MADAM

        String a = "Radar";
        System.out.println("Given String: " + a);

        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            char alpha = a.charAt(i);     //method object ke upar chalti hai
            reverse += alpha;
        }

        System.out.println("Reverse String: " + reverse);

        //we use '.equalsIgnoreCase()' method because, user kaisa bhi input de sakta hai
        if (a.equalsIgnoreCase(reverse)) {        //'.equals()' and '.equalsIgnoreCase' difference
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");
        }
        System.out.println("---------------------------------------------");

        String a1 = "Radar";
        System.out.println("Given String: " + a);

        //we use '.toLowerCase()' method because, user kaisa bhi input de sakta hai
        String a2 = a1.toLowerCase();       //compare wit line no. 20
        System.out.println("Given String converted to lower case: " + a2);
        String reverse1 = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            char alpha1 = a2.charAt(i);     //method object ke upar chalti hai
            reverse1 += alpha1;
        }

        System.out.println("Reverse String: " + reverse1);

        if (a.equals(reverse1)) {        //compare with line no. 20 ['.equals()' and '.equalsIgnoreCase' difference]
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");
        }


    }
}
