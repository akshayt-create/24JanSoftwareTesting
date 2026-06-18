package collectionStudy.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorStudy2 {
    static void main(String[] args) {

        ArrayList<Object> arrList = new ArrayList<>();
        arrList.add("study");
        arrList.add(26);
        arrList.add('a');
        arrList.add(12.36);
        arrList.add("Pune");
        arrList.add(true);
        System.out.println(arrList);

        System.out.println("-----------------------------");
        //for(dataTypeOfArrayList variableName : objectName){}   ---> jis type ki array list us type ka data type
        for(Object a : arrList){
            System.out.println(a);
        }
        System.out.println("==========================================");

        //First cursor --> iterator
        Iterator<Object> itr1 = arrList.iterator();     //Iterator - 1

        Object arrListFirstElement = itr1.next();
        System.out.println(arrListFirstElement);
        System.out.println("-----------------------------");

        while(itr1.hasNext()){
            System.out.println(itr1.next());
        /*
        - Humne yaha pe pehla wala hi iterator use kiya hai, isliye vo iterator
          jahape tha wahise execution start hoga.
         */
        }
        /*
        - Abhi first iterator last element tak pohoch gaya. Toh iterator ko hum
          wapas nahi la sakte. (iterator traverse only in forward direction)
        - Isliye hume ek naya iterator banana padega
         */
        System.out.println("-----------------------------");

        Iterator<Object> itr2 = arrList.iterator();     //Iterator - 2

        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
