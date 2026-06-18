package logicalPrograms;

import java.util.Arrays;

public class AnagramString {
    static void main(String[] args) {


        String s1 = "java";
        String s2 = "avaj";

        char ar1[] = s1.toCharArray();      //{'j','a','v','a'}
        char ar2[] = s2.toCharArray();      //{'a','v','a','j'}

        Arrays.sort(ar1);       //{'a','a','j','v'}
        Arrays.sort(ar2);       //{'a','a','j','v'}

        if (Arrays.equals(ar1, ar2)) {
            System.out.println("Anagram String");
        } else {
            System.out.println("Not Anagram String");
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

//=========================================================================================

        String a1 = "test";
        String a2 = "best";

        char ar11[] = a1.toCharArray();
        char ar22[] = a2.toCharArray();

        Arrays.sort(ar11);
        Arrays.sort(ar22);

        if (Arrays.equals(ar11, ar22)) {
            System.out.println("Anagram String");
        } else  {
            System.out.println("Not Anagram String");
        }
    }
}