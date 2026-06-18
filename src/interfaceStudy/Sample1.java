package interfaceStudy;

public interface Sample1 {

    void test1();
    void test2();

//    static void test5();

    static void test6(){

    }
}
/*
- Hum interface me static methods nahi likh sakte kyuki, interface me methods by-default
  abstract hoti hai. Aur abstract methods kabhi bhi static nahi ho sakti interface me bhi
  aur abstract class me bhi. (line no 8)
- Aur static methods ko hum override bhi nahi kar sakte.
- Agar static methods likhni hai to hume use body deni padegi (line no 10). Aur aisa hum
  multiple inheritance ke time pe karte hai.
 */

