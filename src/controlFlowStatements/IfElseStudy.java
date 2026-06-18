package controlFlowStatements;

public class IfElseStudy {

    //if marks greater than or equal 40 ---> You are pass
    //else ---> You are fail

    /*
    if (condition) {      true --> if body / false --> else body

         //body

   } else {

        //body

   }
     */


    static void main(String[] args) {

        int marks1 = 19;
        if(marks1 >= 40) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are not pass");
        }

        int marks2 = 99;
        if(marks2 >= 40) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are not pass");
        }
        System.out.println("==================================");

        //if gender is 'M' then you are male
        // else you are female
        char gender = 'M';          //case-sensitive
        if (gender == 'M') {
            System.out.println("You are male");
        } else  {
            System.out.println("You are female");
        }
        System.out.println("==================================");

        //if signal is red then stop
        //else go
        String signal = "Yellow";
        if(signal == "Red"){
            System.out.println("Stop");
        } else {
            System.out.println("Go");
        }
    }
}
