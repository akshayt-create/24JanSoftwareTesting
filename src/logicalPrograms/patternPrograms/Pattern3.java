package logicalPrograms.patternPrograms;

public class Pattern3 {

//    *****
//    ****
//    ***
//    **
//    *

    static void main(String[] args) {

        //(rows) (columns) (stars in first row) (spaces in first row)
        int rows = 5;           //no. of rows
        int columns = 5;        //no. of columns
        int stars = 5;          //stars in first row
        int spaces = 0;         //spaces in first row

        //Outer for-loop for rows
        for (int i = 1; i <= rows; i++) {

            //Inner for loop for columns
            for (int j = 1; j<= stars; j++){
                System.out.print("*");
            }
            System.out.println();
            stars--;

        }

    }
}
