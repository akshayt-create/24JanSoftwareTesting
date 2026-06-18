package logicalPrograms;

import java.util.Scanner;

public class ReverseString2 {

    //Reverse odd places in string --> (VDO = )
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("\nPlease enter a string: ");
       String inputStr = sc.nextLine();

       String[] splitStr = inputStr.split(" ");     //splitStr[] = {"...","...","...",.....}

        System.out.println("\nString after reversing odd places:");
       for(int i = 0; i<splitStr.length; i++){

           if(i%2 != 0){

               String temp = splitStr[i];
               String reversed = "";
               for(int j = temp.length() - 1; j>=0; j--){
                   char alpha = temp.charAt(j);
                   reversed += alpha;
               }

               splitStr[i] = reversed;
           }

           System.out.print(splitStr[i] + " ");
       }


    }
}

//Dynamic coding
//Static coding

//HomeWork = Java is programming --> programming is java

