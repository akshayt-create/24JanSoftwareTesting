package exceptionStudy;

import java.util.TreeSet;

public class JavaRuntimeException {

    static void main(String[] args) {

        int a = 10;
        int b = 0;
//        System.out.println(a / b);      //ArithmeticException

        String xyz = null;
//        System.out.println(xyz.length());       //NullPointerException

        String pqr = "test";
//        System.out.println(pqr.charAt(12));     //StringIndexOutOfBoundsException

        int[] arr = {1,2,3,4};
//        System.out.println(arr[11]);        //ArrayIndexOutOfBoundsException

        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
//        treeSet.add("hello");       //ClassCastException


    }
}
