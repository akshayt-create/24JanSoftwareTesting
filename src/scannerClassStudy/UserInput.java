package scannerClassStudy;

import java.util.Scanner;

public class UserInput {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String fName = scanner.next();
        System.out.println();

        System.out.print("Enter Last Name: ");
        String lName = scanner.next();

        System.out.print("\nEnter Age: ");
        int age = scanner.nextInt();
        //Agar aap integer ke jagaha pe string type k input dete ho to compiler 'InputMismatchException' show karta hai.

        System.out.print("\nEnter Gender: ");
        String gen = scanner.next();     //char kareke method nahi hai.
        String gender = gen.toUpperCase();

        System.out.print("\nEnter 10th Percentage: ");
        float percentage = scanner.nextFloat();
        //float ka input dete samay 'f' likhna nahi hai.

        System.out.print("\nEnter City: ");
        String city = scanner.next();
        System.out.println();

        System.out.println("------------------------------------");
        System.out.println("Name: " + fName + " " + lName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("10th Percentage: " + percentage);
        System.out.println("City: " + city);
        System.out.println("------------------------------------");

    }
}
