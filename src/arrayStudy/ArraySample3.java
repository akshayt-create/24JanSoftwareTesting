package arrayStudy;

public class ArraySample3 {
    static void main(String[] args) {

        int test[][] = new int [2][2];      //array declaration

        //array initialization
        test[0][0] = 5;
        test[0][1] = 10;
//        test[1][0] = 15;      //
        test[1][1] = 20;
//        test[2][0] = 25;        //ArrayIndexOutOfBoundsException

        //array usage
        System.out.println(test[1][0]);

        //row --> outer for loop
        for(int i = 0; i <= test.length - 1; i++){

            //columns --> inner for loop
            for(int j = 0; j <= test[i].length - 1; j++){
                System.out.print(test[i][j] + "  ");
            }

            System.out.println();
        }

    }
}
