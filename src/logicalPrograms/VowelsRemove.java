package logicalPrograms;

import java.util.Scanner;

public class VowelsRemove {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter a string: ");
        String inputStr = sc.next();
        int count = 0;
        String result = "";

        String str = inputStr.toLowerCase();
        for (int i = 0; i<str.length(); i++){

            char temp = str.charAt(i);
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
                count++;
                continue;
            }

            result += temp;
        }

        System.out.println("String without vowels: " + result);
    }
}
