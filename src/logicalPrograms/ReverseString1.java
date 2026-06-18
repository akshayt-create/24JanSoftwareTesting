package logicalPrograms;

import java.util.Scanner;

public class ReverseString1 {

    //Reverse string using scanner class
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter string to be reversed:");
        String inputString = scanner.next();

        for (int i = inputString.length() - 1; i>=0; i--){
            System.out.print(inputString.charAt(i));
        }

    }

}
