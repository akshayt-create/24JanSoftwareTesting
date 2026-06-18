package collectionStudy.list;

import java.util.ArrayList;

public class ArrayListStudy {
    static void main(String[] args) {

        ArrayList arrayList = new ArrayList();      //ArrayList ka object hai, ArrayListStudy ka object nahi hai.

        System.out.println(arrayList);

        //how to add elements in arrayList
        //1. add()
        arrayList.add("Velocity");      //for calling objectName.methodName
        arrayList.add(123);
        arrayList.add('A');
        arrayList.add(true);
        arrayList.add(123.2);       //no need to write 'f' after float value. why?
        arrayList.add("");
        arrayList.add(null);        //allows any number of null values
        arrayList.add("Velocity");  //duplicates are allowed
        arrayList.add('A');
        arrayList.add(false);
//        arrayList.add('');          //empty char is not allowed
        arrayList.add(null);
        System.out.println(arrayList);

        arrayList.add(1, "testing");              //add(int index, Object element)
        System.out.println(arrayList);
    }
}
