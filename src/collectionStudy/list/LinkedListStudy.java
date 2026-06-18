package collectionStudy.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {
    static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(12);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(13);
        linkedList.add(19);
        linkedList.add(22);
        System.out.println(linkedList);

        linkedList.add(1, 100);
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));

        linkedList.addFirst(1);
        System.out.println(linkedList);

        linkedList.addLast(111);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println("Cloned List = " + linkedList.clone());

//        linkedList.clear();
//        System.out.println(linkedList);

        System.out.println(linkedList.contains(null));
        System.out.println();

        System.out.println("Offer Methods");
        linkedList.offer(33);
        System.out.println(linkedList);

        linkedList.offerFirst(77);
        System.out.println(linkedList);

        linkedList.offerLast(78);
        System.out.println(linkedList);
        System.out.println();

        System.out.println("Peek Methods");
        System.out.println(linkedList.peek());
        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst());

        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);
        System.out.println();

        System.out.println("Poll Methods");
        System.out.println(linkedList.poll());
        System.out.println(linkedList);

        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList);

        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);
        System.out.println();

        System.out.println("Pop Methods");
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        System.out.println();

        //traversing --> for-loop, for-each-loop, iterator, list-iterator
        //enumeration nahi aayega, because enumeration sirf vector ke liye hai
        System.out.println("For loop");
        for(int i = 0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i));
            //get method hai isliye hum for loop se iterate kar sakte hai
        }
        System.out.println();

        System.out.println("For each loop");
        for(Integer it : linkedList){
            System.out.println(it);
        }
        System.out.println();

        System.out.println("Iterator");
        Iterator<Integer> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        System.out.println("List Iterator");
        ListIterator<Integer> litr = linkedList.listIterator();
        System.out.println("Forward");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

        System.out.println("Backward");
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        //Object <-- Iterable <-- Collection <-- SequencedCollection <-- List <-- LinkedList















    }
}
