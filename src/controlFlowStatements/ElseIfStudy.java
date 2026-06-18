package controlFlowStatements;

public class ElseIfStudy {
    /*
    if (condition) {      true --> if body / false --> else body

         //body

   } else if {

        //body

   } else {


   }
     */

    static void main(String[] args) {

        //Always compare in descending order
        //if marks are greater than or equal to 66 --> distinction
        //if marks greater than or equal to 60 --> 1st class
        //if marks greater than or equal 40 ---> You are pass
        //else ---> You are fail
        int marks = 77;
        if (marks >= 66) {
            System.out.println("You are in distinction");
        } else if (marks >= 60) {
            System.out.println("You are in first class");
        } else if (marks >= 40) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are fail");
        }
        System.out.println("=====================");

        //if signal is red then stop
        //else if signal is yellow then wait
        //else if signal is green then go
        //else give proper signal colour
        String signal = "green";
        if (signal == "red") {
            System.out.println("Stop");
        }  else if (signal == "green") { //true
            System.out.println("Wait");
        } else if (signal == "green") {  //true
            System.out.println("Go");
        } else {
            System.out.println("Provide valid colour");
        }
    }
}

/*
- If two or more than two conditions are true, then also it executes only one condition
  which comes first (line no. 45, 47).
 */
