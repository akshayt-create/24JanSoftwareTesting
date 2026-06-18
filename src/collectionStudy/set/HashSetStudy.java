package collectionStudy.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

    static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("test");
        hSet.add("test");       //does not allow duplicate value
        hSet.add("test");
        hSet.add(null);         //allows only one null value
        hSet.add(null);
        hSet.add("java");       //order of insertion is random
        hSet.add("selenium");
        hSet.add("automation");
        hSet.add("testing");
        System.out.println(hSet);

        hSet.remove("testing");
        System.out.println(hSet);

        System.out.println(hSet.size());

//        hSet.clear();
//        System.out.println(hSet);

        System.out.println(hSet.contains("test"));

        System.out.println(hSet.isEmpty());
        System.out.println();

        /*
        - Traversing --> for-each-loop, iterator
        - 'for-loop' se iterate nahi kar sakte, kyuki index based storage nahi hai
          to index basis get bhi nahi kar sakte.
        - 'list-iterator' sirf list interface ko implement karne wale classes ke liye
          hi hai.
        - And 'enumeration' sirf legacy class ke liye hi hai.
         */

        //For-each-loop
        System.out.println("For-each-loop");
        for(String hs : hSet) {
            System.out.println(hs);
        }
        System.out.println();
        /*
        - But kisi ek ko hi fetch karna hai to hum for-each-loop use nahi kar
          sakte.
        - for-each-loop full traversing ke liye hai
         */

        //Iterator
        System.out.println("Iterator");
        Iterator<String> itr = hSet.iterator();
//        System.out.println(itr.next());
//        itr.next();
//        System.out.println(itr.next());

        //Agar sab ke sab print karne hai to iterator ke saath while loop lagayenge.
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
