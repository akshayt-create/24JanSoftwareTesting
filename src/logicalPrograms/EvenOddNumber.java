package logicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("The number is zero");
        } else if (num%2 == 0){
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is odd");
        }
    }
}
