package logicalPrograms.patternPrograms;

public class Pattern1 {
    static void main(String[] args) {

//        *****
//        *****
//        *****

        //(rows) (columns) (stars in first row) (spaces in first row)
        int rows = 3;
        int columns = 5;
        int stars = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
