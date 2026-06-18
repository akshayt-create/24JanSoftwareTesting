package logicalPrograms.patternPrograms;

public class Pattern12 {
//       *
//      ***
//     *****
//    *******
//     *****
//      ***
//       *
    static void main(String[] args) {

        int rows = 7;
        int columns = 7;
        int stars = 1;
        int spaces = 3;

        for (int i = 1; i <= rows; i++) {

            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();

            if(i < 4){
                stars+=2;
                spaces--;
            } else {
                stars-=2;
                spaces++;
            }


        }

    }
}
