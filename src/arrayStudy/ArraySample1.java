package arrayStudy;

import java.util.Arrays;

public class ArraySample1 {
    static void main(String[] args) {
        //I want to store my rollNum
        int rollNum[] = new int[10];

        //I want to store batters name
        String batters[] = new String[5];       //Array declaration

        batters[0] = "Ishan";       //Array initialization
        batters[1] = "Sanju";
        batters[2] = "";
        batters[3] = "Shardul";
        batters[4] = "Bumrah";
//        batters[5] = "Hardik";      //ArrayIndexOutOfBoundsException

        System.out.println(batters[0]);     //Array usage
        System.out.println(batters[1]);
        System.out.println(batters[2]); //***
        System.out.println(batters[3]);
        System.out.println(batters[4]);
        System.out.println(batters[1]);
//        System.out.println(batters[7]);   //ArrayIndexOutOfBoundsException
        System.out.println("----------------------------------------");

        System.out.println(batters.length);     //Array length
        System.out.println("----------------------------------------");

        //*** (for loop without body)
        for (int i = 0; i < batters.length; i++) System.out.println(batters[i]);
        System.out.println("----------------------------------------");


        //Compare with above for loop
        for (int j = 0; j < batters.length; j++) {
            System.out.println(batters[j]);
        }
        System.out.println("=======================================");

        for (int j = 0; j < batters.length; j++) {
            System.out.println(batters);        //***
        }
        System.out.println("=======================================");

        //for sorting the Array
        Arrays.sort(batters);       //sort Array in alphabetical order
        /*
        - .sort() methods ko saare elements declare kiye hue chahiye. Agar ek bhi element declare
          kiya hua nahi rahega (try after commenting line no 16) to vo exception show karega.
         */
        System.out.println("In ascending order");
        for (int i = 0; i < batters.length; i++) System.out.println(batters[i]);

        System.out.println("=======================================");
        System.out.println("In descending order");
        for (int i = batters.length - 1; i >= 0; i--) {     //only printing in reverse order for descending order
            System.out.println(batters[i]);
        }
        /*
        - Array me sort in descending order aisi kuch method hai hi nahi. Isliye aapko use
          ascending order me sort karke reverse print karna padega (for descending order).
         */



    }
}
