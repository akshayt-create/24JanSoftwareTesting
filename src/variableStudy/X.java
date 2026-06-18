package variableStudy;

public class X {
    //Global variables
    int a = 100;
    int b = 99;
    int d;

    static void main(String[] args) {
        X x = new X();
        x.display();
    }

    public void display(){
        int a = 90;     //local variable
        int sum = a + b;        //compiler is using local 'a' variable
        System.out.println("Sum is " + sum);

        int sum1 = this.a + b;
        System.out.println("Sum is " + sum1);
        /* yaha pe display method ko do 'a' name ke variables pata hai ek local aur ek global. Isliy sum1 me
           agar hum direct a+b likhte to compiler ko lagta 'a' local variable hai (compiler hamesha nearest
           variable ko consider karta hai, agar specifically define nahi kiya hai to). Isliye 'this'
           keyword ka use karke compiler ko batana pada ki bhai 'a' local nahi global variable hai 'this.a'
           karke.
        */

        int c = 8;
        System.out.println("c value is " + c);
        System.out.println("d value is " + d);
    }

    public void show(){
        int d;
        int c = 77;
        int sub = c - a;
        System.out.println("Sub value is " + sub);
//        System.out.println("Sub value is " + d);

        /*
         - Abhi show method ke pass koi bhi 'a' name ka local variable nahi hai. Isliye yaha duplicate variables
           ka koi problem nahi hai. Yaha pe compiler confuse nahi hoga aur vo directly 'sub' operation me 'a' ko
           global hi consider karega. 'this' keyword ka use karke use specifically batana nahi padega ki bhai 'a'
           global variable hai karke.
         */
    }
}

/*
 - 'this' keyword is a assignment variable.

 - Global variables aap throughout the class kaha pe bhi use kar sakte hai, kaha pe bhi access kar sakte hai.

 - Jo variable kisi method ke andar declare kiye jate hai unhe local variables kehate hai.

 - Local variables jis method me declare kiye jate hai unka scope usi method tak rehata hai. Us method ke
   bahar kisi ko bhi pata nahi ki vo kon hai, unki value kya hai.

 - Local variables ko hum uski method ke bahar call nahi kar sakte. Lekin gloabal variables ko hum throughout class
   kahi pe bhi, kisi bhi method me call kar sakte hai.

 - Local variables ko sirf declare karke nahi chod sakte unko initialized bhi karna padta hai. Jabtak aap
   local variables initialized nahi karte tab tak uska use allowed nahi hai. Hum local variable isliye declare
   karte hai kyuki unko kuch-na-kuch value asign karni hai. Isiliye unko default value bhi assign nahi hoti
   hai.

 - Lekin global variables ko sirf declare bhi kar sakte hai aur unka bina initialized kiye use bhi allowed hai.
   Kyuki unko default value assign hoti hai taki kisi bhi method me uska use ho sake. Aur user ko lagta hai
   ki global variable ki value change karni hai to vo kisi bhi method me usko value ke saath initialized bhi
   kar sakta hai.

 - Aap local variables jab bhi declare karte hai tab it is recomended to initilized them in local only. Isliye
   compiler bina initialized local variables ka use allowed nahi karta hai. Isliye jo variables kisi method
   me declare aur initialized hote hai unhe local variables kehate hai.
 */