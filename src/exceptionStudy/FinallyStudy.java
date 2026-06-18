package exceptionStudy;

public class FinallyStudy {

    static void main(String[] args) {

        String a = null;
//        String a = "test";

        try {
            System.out.println(a.length());

        } finally {
            System.out.println("Finally block executed");

        }

        System.out.println("End of code");
    }
}

/*
- Yaha pe exception to aayega kyuki humne usko handle nahi kiya hai.

- Par uske pehale finally block execute hoga. Agar exception aata hai to
  pehli priority finally block ko jati hai.

- Finally block hamesha execute hoga hi hoga.

- Uske aage ka code bhi execute nahi hoga (line no 18).

- Agar exception nahi aata hai to pura code execute hoga.
  Means, Result :-
         4
         Finally block executed
         End of code

 */
