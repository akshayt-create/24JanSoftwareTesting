package logicalPrograms;

import java.util.Scanner;

public class VowelsCount {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter a string:- ");
        String inputStr = sc.next();

        int count = 0;
        char alpha;
        String result = "Which are: ";

        String str = inputStr.toLowerCase();
        for (int i = 0; i < str.length(); i++) {


            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                        str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
                result += str.charAt(i) + " ";
            }

        }
        System.out.println("Total no. of vowels found: " + count);
        System.out.println(result);


    }
}
