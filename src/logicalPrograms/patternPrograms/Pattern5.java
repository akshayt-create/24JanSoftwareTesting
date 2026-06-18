package logicalPrograms.patternPrograms;

public class Pattern5 {

//    *****
//     ****
//      ***
//       **
//        *

    static void main(String[] args) {

        //(rows) (columns) (stars in first row) (spaces in first row)
        int rows = 5;           //no. of rows
        int columns = 5;        //no. of columns
        int stars = 5;          //stars in first row
        int spaces = 0;         //spaces in first row

        //Outer for-loop for rows
        for (int i = 1; i <= rows; i++) {

            //For spaces
            for (int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            spaces++;

            //For stars
            for (int k = 1; k<= stars; k++){
                System.out.print("*");
            }
            System.out.println();
            stars--;

        }
    }
}
