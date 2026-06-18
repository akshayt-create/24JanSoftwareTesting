package constructorStudy;

public class C {
    int x;
    int y;

    static void main(String[] args) {
        C c1 = new C();
        c1.addition();

        C c2 = new C(1, 99);
        c2.addition();

        c1.addition(22,22);     //calling parameterized method using non-parameterized constructor

        c2.addition(22,11);     //calling parameterized method using parameterized constructor
    }

    public C(){
        x = 7;
        y = 3;
    }

    public C(int p, int q){
        x = p;
        y = q;
    }

    public void addition(){
        int sum = x + y;
        System.out.println("Sum is " + sum);
    }

    public void addition(int m, int n){
        int sum = m + n;
        System.out.println("Sum is " + sum);
    }
}

/*
 - Jab humne c2 (object with parameterized constructor) object ka use karke parameterized method (addition)
   ko call kiya, tab constructor ko jo parameters pass kiye unka kuch bhi use nahi hua. Kyuki humne jo method
   call ki hai vo parameterized method hai aur humne us method ko jo parameters pass kiye unhone constructor
   ke parameters ko override kar diya.

 - Par hum constructor with parameters and methods with parameters tab use kar sakte hai jab hume global variables
   and method ke local variables initialized karne hai. Is case me hum constructor se global variables initialized
   karenge aur parameterized methods se local variables.
 */
