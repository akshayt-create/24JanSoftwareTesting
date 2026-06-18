package logicalPrograms;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicateAndSort {
    static void main(String[] args) {

        int rollNum[] = {12, 54, 23, 12, 87, 11, 77, 12, 54};

        //Converting array into tree-set
        //For sorting in ascending order and removing duplicates
        TreeSet<Integer> tS = new TreeSet<>();
        for (int rN : rollNum){
            tS.add(rN);
        }
        System.out.println(tS);     //sorted in ascending order and duplicates are removed
        System.out.println();

        /*
        - for getting highest and lowest element, we have to convert tree-set into
          array-list to fetch ech element index wise.
        - Because tree-set does not suppert index wise fetching.
        - Tree-set ke pass get method nahi hai isliye.
         */
        ArrayList<Integer> list = new ArrayList<>(tS);      //converted to array-list

        //using inbuilt methods
        System.out.println("Using inbuilt methods:-");
        System.out.println(list.getFirst());    //lowest
        System.out.println(list.getLast());     //highest
        System.out.println();

        //using size method
        System.out.println("Using size methods:-");
        System.out.println("Size = " + list.size());
        System.out.println(list.get(list.size()-1));    //highest
        System.out.println(list.get(list.size()-2));    //second highest
        System.out.println(list.get(0));        //lowest


    }
}