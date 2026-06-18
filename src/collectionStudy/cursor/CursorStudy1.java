package collectionStudy.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorStudy1 {

    static void main(String[] args) {

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("test1");
        arrayList2.add("test2");
        arrayList2.add("test3");
        arrayList2.add("test4");
        arrayList2.add("test5");
        System.out.println(arrayList2);
        System.out.println("---------------------------------------");


        System.out.println("for each loop");
        //for(dataTypeOfArrayList variableName : objectName){}   ---> jis type ki array list us type ka data type
        for (String bb : arrayList2) {
            System.out.println(bb);
        }
        System.out.println("======================================");

        System.out.println(arrayList2);
        System.out.println("Iterator");
        Iterator<String> itr = arrayList2.iterator();
        while(itr.hasNext()){
            itr.next();
            itr.remove();       //can works only with .next() method
        }
        System.out.println(arrayList2);
        System.out.println("======================================");

        System.out.println("List Iterator");

    }
}