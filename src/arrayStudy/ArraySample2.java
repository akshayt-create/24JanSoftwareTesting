package arrayStudy;

import java.util.Arrays;

public class ArraySample2 {
    public static void main(String[] args) {

        int rollNum[] = {2,6,31,24,95,54,71,21,60};

        System.out.println(rollNum[5]);
        System.out.println("------------------------------");

        for(int i = 0; i < rollNum.length; i++){
            System.out.println(rollNum[i]);
        }
        System.out.println("================================");

        System.out.println("In ascending order");
        Arrays.sort(rollNum);
        for(int i = 0; i < rollNum.length; i++){
            System.out.println(rollNum[i]);
        }
        System.out.println("--------------------------------");

        System.out.println("In descending order");
        for (int i = rollNum.length - 1; i >= 0; i--) {
            System.out.println(rollNum[i]);
        }

    }
}
