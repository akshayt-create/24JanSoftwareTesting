package collectionStudy.queue;

import java.util.PriorityQueue;

public class PriorityQueueStudy {

    static void main(String[] args) {

        PriorityQueue<Object> pQ = new PriorityQueue<>();

        pQ.add(123);
//        pQ.add("test");       //ClassCastException
        pQ.add(100);
        pQ.add(123);        //Allows duplicates
        pQ.add(145);
//        pQ.add(null);         //NullPointerException
        pQ.add(99);
        System.out.println(pQ);     //order of insertion is random
    }
}
