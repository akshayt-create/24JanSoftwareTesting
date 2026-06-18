package collectionStudy.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

    static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        System.out.println(vector);

        vector.add("test");
        vector.add(123);
        vector.add(true);
        vector.add(false);      //duplicates are allowed in vector
        vector.add(new Object());
        vector.add(123);      //duplicates are allowed in vector
        vector.add('A');
        vector.add(null);
        vector.add(null);       //allows any number of null value
        System.out.println(vector);

        vector.add(2, 90);
        System.out.println(vector);

        System.out.println(vector.get(5));
        System.out.println(vector.get(6));

        vector.addElement(12);
        //This method is identical in functionality to the add(E) method (which is part
        //of the List interface).
        System.out.println(vector);

        Object ele = vector.elementAt(2);
        //This method is identical in functionality to the get(int) method (which is
        //part of the List interface).
        System.out.println(ele);

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());

        vector.insertElementAt(888, 1);
        System.out.println(vector);

        System.out.println("===========for loop================");
        for (int i = 0; i <= vector.size() - 1; i++) {
            System.out.println(vector.get(i));
        }

        System.out.println("==========for-each loop================");
        for (Object v : vector) {
            System.out.println(v);
        }

        System.out.println("===========iterator==============");
        Iterator<Object> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("===========list-iterator==============");
        System.out.println("forward");
        ListIterator<Object> litr = vector.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("---------------------------------------");
        System.out.println("backward");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        //list-iterator methods
//            litr.add(12);     ---> to add
//            litr.remove();    ---> to remove
//            litr.set('A');    ---> to update

        System.out.println("===========enumeration==============");
        Enumeration<Object> enu = vector.elements();
        //enumeration ke liye enumeration karke method nahi hai, elements() aisi method hai.
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }


    }
}
