package logicalPrograms.patternPrograms;

public class Pattern10 {

//    *****
//    ****
//    ***
//    **
//    *
//    **
//    ***
//    ****
//    *****

    static void main(String[] args) {

        int rows = 9;
        int columns = 5;
        int stars = 5;
        int spaces = 0;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < 5) {
                stars--;
            } else {
                stars++;
            }
        }


    }

}
