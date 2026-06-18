package variableStudy;

public class Z {
    int a = 1;      //global variable
    static int b = 2;       //global variable (static variables are always global variables)

    static void main(String[] args) {

    }

    public void add() {
        int a = 10;         //local variable (because it is declared and initialized in method)
        int b = 2;

//        static int d = 11;        //Static variables never be local
        /*
        - Local variables by default non-static hote hai.
        - Aur static variables by default global hote hai. Isliye hum method ke andar
          static variables declare nahi kar sakte. Static variables humesha global hi hone
          chahiye. Ya hum unhe sirf globally hi declare kar sakte hai.
         */

        int sum = a + 10;       //compiler will use local value of 'a' (10)
        System.out.println(sum);

        int sum1 = this.a + 10;      //compiler will use global value of 'a' (1)
        System.out.println(sum1);

        int sum2 = Z.b + 10;      //compiler will use global value of 'b'
        /*
        - Jo kuch aapke static variables hote hai, unko aap throughout the class hamesha ke liye
          use kar sakte hai any of the methods me.
        - Static variables ko aap static methods and non-static methods me bhi access kar sakte hai.
        - Jo bhi static variables hote hai unka font italic ho jata hai.
        - Static variables ko call karne ke liye 'this' keyword ki jarurat nahi padti. Unko directaly
          'ClassName.' se call kiya ja sakta hai. Phirbhi aapne 'this' keyword se call kiya to vo warning
          show karega, error nahi dikhayega.
         */
        System.out.println(sum2);
    }

    public static void sub() {      //static method
        int a = 9;      //local variable
        int sub = a - 10;
        System.out.println(sub);

        Z z = new Z();
        System.out.println(z.a);

//        int sub1 = this.a - 10;
//        System.out.println(sub1);
        /*
        - Static type ke methods me aap non-static global variable ko access nahi kar sakte. Directly bhi
          aur 'this' keyword lagake bhi.
        - Matlab static methods me aap sirf static global variables ko hi access kar sakte hai (Compare it
          with line no. 33).
        - Agar non-static variables ko static methods me access karna hi hai to use object create karke acess
          kiya ja sakta hai (Line no. 47, 48).
        - Lekin static method me local variables non-static rahete hai. Kyuki local variables hamesha
          non-static hi hote hai.
         */

        int sub1 = b - 10;      //par static method me aap static global variables ko access kar sakte hai.
        System.out.println(sub1);


        /*
        In short:-
          - Non-static methods me aap static and non-static global variables ko call kar sakte hai.
          - Aur static methods me aap sirf static global variables ko hi call kar sakte hai. Abhi vo
            static global variables hai to unhe directly 'ClassName.variableName' aise call kar sakte hai.
          - Lekin 'main method' static hote hue bhi aap 'main method' me non-static variables ko call kar sakte hai.
            Lekin object ke through.
          - Isliy aisa keh sakte hai ki static methods me 'this' keyword ka kuch bhi kam nahi hai. Kyu ki static
            method me hum non-static variables ko call hi nahi kar sakte. 'this' keyword sirf non-static methods
            ke liye hai.
          - Non-static variables ko sirf object ke through (and 'this.' keyword ke through) hi call kiya ja sakta
            hai.
         */


    }
}
