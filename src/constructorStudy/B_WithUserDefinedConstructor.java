package constructorStudy;

public class B_WithUserDefinedConstructor {
    int a = 1;      //Global variables declaration and initialization
    int b = 2;      //Global variables declaration and initialization

    public B_WithUserDefinedConstructor(){      //user defined non-parameterized constructor
        a = 10;
        b = 20;
        System.out.println("Value of a is " + a + " and b is " + b );
    }

    public B_WithUserDefinedConstructor(int x, int y){      //user defined constructor with parameters
        a = x;
        b = y;
        System.out.println("Value of a is " + a + " and b is " + b );
    }

    static void main(String[] args) {
        //creating object 'b' using non-parameterized constructor
        B_WithUserDefinedConstructor b = new B_WithUserDefinedConstructor();    //calling non-parameterized constructor
        b.add();       //calling add method using object 'b'

        //creating object 'b1' using parameterized constructor
        B_WithUserDefinedConstructor b1 = new B_WithUserDefinedConstructor(8,2);    //calling parameterized constructor
        b1.add();       //calling add method using object 'b1'

        //creating object 'b2' using parameterized constructor
        B_WithUserDefinedConstructor b2 = new B_WithUserDefinedConstructor(100,2);    //calling parameterized constructor
        b2.add();       //calling add method using object 'b2'
    }

    public void add(){
        int sum = a + b;
        System.out.println("Sum is " + sum);
        System.out.println();
    }
}

/*
 - Is class me humne global variables ko value assign ki hai. (a = 1, b = 2)
 - Par isi class me humne jo non-parameterized constructor define kiya hai usme a and b ki value update ki
   hai (a = 10, b = 20) aisi. Isliy jab bhi hum koi method object ke through call karte hai tab purani wali
   values nayi values se update ho jati hai. Aur purani values ka koi use nahi hota. Vo usless hoti hai isliye
   vo values initialized (global variables ko) nahi kiya to bhi chalta hai.
 - Kyuki uska use hi nahi hota agar hum constructor use karne wale hai to.
 - Agar hum koi bhi constructor define nahi karte hai, matlab background me default constructor rehata hai
   to hi golbal variables ki values use hogi throughout the class. Agar global variables initialized kiye
   gaye hai to vo values use hogi, nahi to uski default values use hogi.
 - Agar constructor me local variables 'a' and 'b' declare kiye jayenge to kya hoga?
 */
