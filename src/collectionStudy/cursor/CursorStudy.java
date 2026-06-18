package collectionStudy.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorStudy {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(24);
        arrayList.add(36);
        arrayList.add(42);
        arrayList.add(59);
        arrayList.add(16);
        arrayList.add(73);
        arrayList.add(8);
        arrayList.add(29);
        System.out.println(arrayList);      //print whole array list
        System.out.println("======================================");

        System.out.println("for loop");
        //First way to traverse array list.
        //for loop cursor nahi hai, ye ek traversing ka tariqa hai.
        for(int i = 0; i<=arrayList.size()-1; i++){
            System.out.println(arrayList.get(i));       //print each element of array list
        }
        System.out.println("======================================");

        System.out.println("for each loop");
        //for each loop (advanced for loop)
        //for-each loop is applicable for array and collections only.
        //for(dataTypeOfArrayList variableName : objectName){}   ---> jis type ki array list us type ka data type
        for(Integer aa : arrayList){
            System.out.println(aa);
        }
        System.out.println("------------------------------");

        for(int aa : arrayList){            //Integer ke jagah int liya hai to bhi loop chal raha hai
            System.out.println(aa);
        }
        System.out.println("======================================");

//===========================================================================================================================

        System.out.println("Iterator");
        //First cursor --> iterator
        Iterator<Integer> itr = arrayList.iterator();       //iterator() method is a method of Iterator interface
        while(itr.hasNext()){
            Integer a = itr.next();
            System.out.println(a);
//            itr.remove();         //*** (to get the result of line no 59 and 65, comment this line (line no 29))
        }

//        itr.remove();
//        System.out.println(arrayList);

//        itr.next();

        System.out.println(arrayList);
        System.out.println("======================================");

//===========================================================================================================

        System.out.println("List-Iterator");
        System.out.println("Forward");
        //Second cursor --> list-iterator
        ListIterator<Integer> litr = arrayList.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());    //to get result --> comment line no. 52 --> 'itr.remove()'
        }

        litr.remove();

        System.out.println("---------------------------------------");
        System.out.println("Backward");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());    //to get result --> comment line no. 52 --> 'itr.remove()'
        }
        /*
        - .hasPrevious() and .previous() methods .hasNext() or .next() methods ke bad hi execute hogi, kyuki
          wapas aane ke liye pahele aage to jana padega na.
        - Because we have executed the .remove() method we did not get the last element (29) in backward
          printng because it is removed in line no 73.
         */

    }
}
