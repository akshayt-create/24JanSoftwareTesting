package collectionStudy.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkeHashSetStudy {
    static void main(String[] args) {

        LinkedHashSet<Integer> lHS = new LinkedHashSet<>();     //order of insertion is maintained
        lHS.add(23);
        lHS.add(13);
        lHS.add(22);
        lHS.add(33);
        lHS.add(43);
        lHS.add(23);        //duplicates are not allowed
        lHS.add(7);
        lHS.add(8);
        lHS.add(9);
        lHS.add(null);      //only one null value is allowed
        lHS.add(null);
        System.out.println(lHS);
        System.out.println();

        System.out.println(lHS.size());

        lHS.addFirst(11);
        lHS.addLast(42);
        System.out.println(lHS);

        System.out.println(lHS.size());
        System.out.println();

        System.out.println("Get method :-");
        System.out.println(lHS.getFirst());
        System.out.println(lHS.getLast());
        System.out.println(lHS.getLast()-1);    //***
        System.out.println(lHS);
        System.out.println();

        System.out.println("Remove method :-");
        System.out.println(lHS.remove(8));
        System.out.println(lHS.removeFirst());
        System.out.println(lHS.removeLast());
        System.out.println(lHS);
        System.out.println();

//        System.out.println("Clear method :-");
//        lHS.clear();
//        System.out.println(lHS);
//        System.out.println();

        System.out.println("Clone method :-");
        System.out.println(lHS.clone());
        System.out.println();

        System.out.println("Equals method :-");
        Object cloned = lHS.clone();
        System.out.println(lHS.equals(cloned));
        System.out.println("======================================");
        System.out.println();

        //Iteration --> for-each loop, iterator
        //for-each loop
        System.out.println("for-each loop :-");
        for(Integer l : lHS){
            System.out.println(l);
        }
        System.out.println();

        //iterator
        System.out.println("Iterator :-");
        Iterator<Integer> itr = lHS.iterator();
        //for printing individual elements
        System.out.println(itr.next());
        System.out.println(itr.next());
        /*
        - Yaha pe next method do bar chalai hai to, iterator 1 index pe rahega.
        - Iske baad agar same iterator pe while loop chalate hai to vo 1 index
          see hi continue karega.
         */

        //for printing entire set
        while(itr.hasNext()){           //agar pahile element se print kara hai to naya iterator banana padega
            System.out.println(itr.next());
        }
        //*** --> check the output of iterator

        //listIterator sirf list interface ko support karta hai
        //enumeration sirf legacy class ko





    }
}
