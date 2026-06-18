package collectionStudy.cursor;

import java.util.ListIterator;
import java.util.Vector;

public class CursorStudy3 {
    static void main(String[] args) {

        Vector<Object> vector = new Vector<>();
        System.out.println(vector);

        vector.add("test");
        vector.add(123);
        vector.add(true);
        vector.add(false);      //duplicates are allowed in vector
        vector.add(new Object());
        vector.add(124);
        vector.add('A');
        vector.add(null);
        vector.add(null);       //allows any number of null value
        System.out.println(vector);

        vector.add(2, 90);
        System.out.println(vector);

        ListIterator<Object> litr = vector.listIterator();
        System.out.println(litr.next());
        litr.remove();
        System.out.println(vector);

//        litr.next();      //no need to call next() method after remove() method, cursor remains at its place
        litr.add("Velocity");
        System.out.println(vector);

        litr.add("classes");
        System.out.println(vector);

        litr.next();
        litr.next();
        litr.next();
        litr.next();
        litr.next();
        litr.remove();
        System.out.println(vector);
//        System.out.println(litr.next());

        litr.add("Where");
        System.out.println(vector);
    }
}
