package polymorphism;

public class Sample1 extends Sample{

    static void main(String[] args) {
        a(10);

    }

    public void a(){
        System.out.println("non-static method a of subclass");
    }

    public static void a(int x){
        System.out.println("Static method with int parameter of subclass" + x);
    }
}
/*
- Abhi yaha pe hume jo super class ki method hai vo hi exact same sub class me likhi hai,
  lekin vo sirf non-static method ko override bata raha hai par static method ko nahi bata
  raha.
- To hum static methods ko kabhi bhi override nahi kar sakte. Kyuki static elements remains
  with the class. Unhe class ke bahar share nahi kiya jata.
- Isiliye yaha pe humne jo static method declare ki hai to vo is class ki seperate method ho
  gayi hai.
-----------------------------------------------------------------------------------------------
- So, can we override main method? --> No. Kyuki, sabse pehali baat, main method static hoti hai.
  Phir bhi humne parent class ki exact same main method (refer Sample class main method) ko child
  class me likha (refer Sample1 class main method) to vo child class ki seperate main method ho
  jayegi. Kyuki static context remains with the class only.
====================================================================================================
- Same isi taraha se humne static methods ko bhi abstract nahi kar sakte aisa bola tha. Iska reason
  bhi vo hi hai. Abstract method ko complete karne ke liye concrete class (subclass) ki jarurat hoti
  hai aur concrete class me hum abstract methods ko override karte hai to agar abstract method static
  hoti hai to hum use class ke bahar share hi nahi kar payenge (override nahi kar payenge), kyuki static
  methods remains with the class only. Isiliye abstract methods kabhi bhi static nahi hoti.
 */
