package variableStudy;

public class W {
    int a = 9;              //non-static global variable
    static int b = 10;      //static global variable

    static void main(String[] args) {
        W w = new W();
        int sub = w.a - 1;  //used global non-static variables from same class (call with object)
        System.out.println(sub);

        int sub1 = b - 1;   //used static variables from same class (direct call because static variables belongs to same class)
        /*
        - Main method me agar global variables ko call karna hai to same process follow karni padegi, jaisi
          methods ko call karne ke liye use ki jati hai.
        - Matlab non-static variables ko call karne ke liye object create karna padega (objectName.variableName)
          aur static variables ko call karna hai to directly call karna padega (variableName  --> same class me).
        - Main method static hoti hai isliye usme 'this' keyword ka kuch use nahi hai.
         */
    }

    public void addition(){
        int sum = a + 10;
        System.out.println(sum);

        int sum1 = b + 10;
        System.out.println(sum1);

    }
}
