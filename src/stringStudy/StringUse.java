package stringStudy;

public class StringUse {

    static void main(String[] args) {
//      A a = new A();
        String city = "Pune";  //Heap --> String pool --> Constant pool area
        int a = 10;
        System.out.println(city);
        /*
        - Tino syntax exact same hai, class type ke variable ko object kehte hai.
         */

        String country = new String("India");  //Heap --> String pool --> Non-constant pool area
        System.out.println(country);
    }
}
/*
- 'new' is a memory assignment operator.
- Jab bhi hum new keyword ke saath string banate hai tab vo new memory location
  pe store hoti hai. Duplicate ho to bhi.
- Aur jab hum exact duplicate string banate hai par new keyword ka use nahi karte hai,
  tab objects to alag-alag banege par sab ek hi memory location ko point karenge.
- Agar new keyword ka use kiya hai to string ka content kuch bhi rehne do, har bar alag
  alag objects ke liye separate memory location banegi. String ka content exact same ho
  to bhi.
 */
