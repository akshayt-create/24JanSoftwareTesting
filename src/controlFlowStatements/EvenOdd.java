package controlFlowStatements;

public class EvenOdd {
    static void main(String[] args) {

        System.out.println(9 / 2);  //gives quotient
        System.out.println(9 % 2);  //gives remainder

        int num = 9;
        if (num % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }
    }
}
