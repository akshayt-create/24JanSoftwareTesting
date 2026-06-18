package collectionStudy.list;

import java.util.ArrayList;

public class ArrayListStudy1 {

    static void main(String[] args) {

        //Specific array list -->  can store only that specified type data
        ArrayList<String> arList = new ArrayList<>();      //ArrayList ka object hai, ArrayListStudy1 ka object nahi hai.
        System.out.println(arList);

        arList.add("test");
        arList.add("test1");
        arList.add("test2");
        System.out.println(arList);
        System.out.println("=============================");

        //General array list --> (object typed) can store generalized typed data
        ArrayList<Object>  arList2 = new ArrayList<>();
        System.out.println(arList2);

        arList2.add("test");
        arList2.add(123);
        arList2.add(true);
        System.out.println(arList2);

    }
}
