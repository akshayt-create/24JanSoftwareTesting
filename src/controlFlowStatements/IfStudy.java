package controlFlowStatements;

public class IfStudy {
    static void main(String[] args) {

        /*
         if (condition) {

         //body ---> body executes only when condition is true.

         }
        */


        //if marks > 40 ----> You are pass
        int marks = 90;
        if (marks > 40) {
            System.out.println("You are pass");
        }
        System.out.println("================================");


        //if marks >= 40 ----> You are pass
        int mark = 40;
        if (mark >= 40) {
            System.out.println("You are pass");
        }
        System.out.println("================================");

        //if gender is M then you are male
        char gender = 'M';      //case-sensitive
        if (gender == 'M') {
            System.out.println("You are male");
        }
        System.out.println("================================");


        //if signal is red then stop
        String signal = "yellow";       //case-sensitive
        if (signal == "Red") {
            System.out.println("Stop");
        }
    }
}

/*
- 'if' can check only one condition.
- If the condition is true then only the body of 'if' is executed.
- If the condition is false then the body will be skipped.
 */
