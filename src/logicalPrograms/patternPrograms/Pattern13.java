package logicalPrograms.patternPrograms;

public class Pattern13 {

//    *         *
//    **       **
//    ***     ***
//    ****   ****
//    ***** *****
//    ****   ****
//    ***     ***
//    **       **
//    *         *

    static void main(String[] args) {

        int rows = 9;           //total no. of rows
        int columns = 11;       //total no. of columns
        int stars1 = 1;         //total no. of stars1 in first row
        int spaces = 9;         //total no. of spaces in first row
        int stars2 = 1;         //total no. of stars2 in first row

        //outer for loop --> rows
        for (int i = 1; i <= rows; i++) {

            //loop for stars1
            for (int j = 1; j <= stars1; j++) {
                System.out.print("*");
            }

            //loop for spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //loop for stars2
            for (int k = 1; k <= stars2; k++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < 5) {
                stars1++;
                spaces -= 2;
                stars2++;

            } else {
                stars1--;
                spaces += 2;
                stars2--;
            }
        }

    }
}
