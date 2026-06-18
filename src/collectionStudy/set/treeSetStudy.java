package collectionStudy.set;

import java.util.TreeSet;

public class treeSetStudy {

    static void main(String[] args) {

        /*
        - Tree set humesha homogeneous hota hai, vo kabhi bhi heterogeneous
          nahi hota.
        - Agar aap tree-set ka data type object bhi lete ho to, aap usme first
          element jis type ka add karoge usi type ke ageke saare element aapko
          lene padege. Agar nahi liye to vo aapko 'ClassCastException' (run time)
          show karega.
        */

        TreeSet<Object> tSet = new TreeSet<>();     //order of insertion:- ascending order
        tSet.add(12);
//        tSet.add("test");     //*** (ClassCastException)
        tSet.add(53);
        tSet.add(23);
        tSet.add(23);       //duplicates are not allowed
        tSet.add(15);
        tSet.add(100);
//        tSet.add(null);     //null values are not allowed (NullPointerException)
        tSet.add(41);
        tSet.add(3);
        tSet.add(72);
        System.out.println(tSet);
        System.out.println();

        System.out.println("ceiling method:-");
        System.out.println(tSet.ceiling(42));
        System.out.println(tSet.ceiling(41));
        System.out.println(tSet.ceiling(13));
        System.out.println(tSet.ceiling(100));
        System.out.println(tSet.ceiling(120));      //***
        System.out.println(tSet.ceiling(0));
        System.out.println();

        System.out.println("floor method:-");
        System.out.println(tSet.floor(42));
        System.out.println(tSet.floor(41));
        System.out.println(tSet.floor(13));
        System.out.println(tSet.floor(100));
        System.out.println(tSet.floor(120));
        System.out.println(tSet.floor(2));          //***
        System.out.println(tSet.floor(-3));
        System.out.println();

        System.out.println("poll method:-");
        System.out.println(tSet);
        System.out.println("pollFirst method:-");
        System.out.println(tSet.pollFirst());
        System.out.println(tSet);

        System.out.println("pollLast method:-");
        System.out.println(tSet.pollLast());
        System.out.println(tSet);





    }
}
