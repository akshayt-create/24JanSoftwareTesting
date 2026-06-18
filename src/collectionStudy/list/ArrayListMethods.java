package collectionStudy.list;

import java.util.ArrayList;

public class ArrayListMethods {

    static void main(String[] args) {

        ArrayList<Integer> arList = new ArrayList<>();

        arList.add(99);
        arList.add(91);
        arList.add(94);
//        arList.add("test");       we cannot add data other than 'int'
        System.out.println(arList);

        arList.add(88);
        System.out.println(arList);
        System.out.println(arList.add(88));     //returns boolean
        boolean result = arList.contains(188);   //return type of .add() method is boolean
        System.out.println(result);
        System.out.println(arList);

        arList.add(1,100);
        System.out.println(arList);

        arList.addLast(40);
        System.out.println(arList);

        arList.addFirst(1);
        System.out.println(arList);
        System.out.println("==============================");

//        arList.clear();       //clears the array list
//        System.out.println(arList);

        //Object class is Super most class of all classes in java
        Object arListCloned = arList.clone();
        /*
        - return type of .clone() method is Object even though original list is of Integer type.
        - .clone() method Object type ki hi list return karegi (Object return karegi), bhalahi
          original list kisi bhi type ki ho.
         */
        System.out.println("Cloned Array list --> " + arListCloned);
        System.out.println("Original Array list --> " + arList);

        boolean result1 = arList.equals(arListCloned);      //for .equals() method we required at least two objects
        System.out.println(result1);
        System.out.println("==============================");

        arList.add(23);
        System.out.println("Updated original --> " + arList);
        System.out.println("Cloned --> " + arListCloned);
        boolean result2 = arList.equals(arListCloned);
        System.out.println(result2);        //false --> because we added 23 in original list after cloning
        System.out.println("==============================");

        boolean result3 = arList.contains(23);      //return type of .contains() method is boolean
        System.out.println(result3);

        System.out.println(arList.contains(880));
        System.out.println("==============================");

        int element = arList.get(3);        //same as method --> .charAt()
        System.out.println(element);

//        int element2 = arList.get(330);        //IndexOutOfBoundsException
//        System.out.println(element2);

        Integer element3 = arList.get(2);       //*** --> Integer data type
        System.out.println(element3);

        Object element4 = arList.get(6);       //*** --> Object data type
        System.out.println(element4);

        //List, index based store karta hai isliye aap usko index based puch sakte ho.
        System.out.println("==============================");

        System.out.println(arList.getFirst());      //return type of .getFirst() method is Integer/int (because ArrayList<Integer>)
        System.out.println(arList.getLast());
        System.out.println("==============================");

        int elem = arList.indexOf(23);
        System.out.println(elem);
        System.out.println(arList.indexOf(205));        //-1 because element is not present/found
        System.out.println("==============================");

        System.out.println(arList.indexOf(88));     //Returns the index of the first occurrence of the specified element in this list
        System.out.println(arList.lastIndexOf(88));     //Returns the index of the last occurrence of the specified element in this list
        System.out.println("==============================");

        System.out.println(arList);

        int sizeOfArList = arList.size();
        System.out.println("Size of ArList is " + sizeOfArList);
        System.out.println("==============================");

        System.out.println(arList.isEmpty());
        System.out.println("==============================");

        System.out.println(".remove() method");
        boolean result4 = arList.remove("100");     //object type of remove method returns boolean
        System.out.println(result4);
        System.out.println(arList);
        System.out.println("--------------------------------");

//        System.out.println(arList.remove(40));        //IndexOutOfBoundsException
        /*
        - IndexOutOfBoundsException because .remove() method consider element as an index.
        - Isliye object basis ki remove method ko integer type ke array-list me use mat kijiye.
         */
        System.out.println(arList);
        System.out.println("--------------------------------");

        System.out.println(arList.remove(3));       //returns the element which is removed
        System.out.println(arList);

//        arList.removeFirst();
//        arList.removeLast();
//        arList.removeAll(arList);
        System.out.println("==============================");

        arList.set(6, 44);
        System.out.println(arList);
        System.out.println("==============================");




    }
}
