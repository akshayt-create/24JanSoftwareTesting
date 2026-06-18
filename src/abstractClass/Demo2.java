package abstractClass;

public class Demo2 extends Demo1{

    public Demo2 (){
//        super(5);
        System.out.println("Constructor of Demo2");
    }

    static void main(String[] args) {
//        Demo1 d1 = new Demo1();
        Demo2 d = new Demo2();
    }
    @Override
    public void a1() {
        System.out.println("a1 method of Demo1 completed in Demo2");
    }

}
/*
- Abstract class ka object hum kahi pe bhai nahi bana sakte. Us class me bhi aur kisi
  dusre class me bhi. (Refer line no. 11)
- Isliye humne Demo2 ka object create kiya hai (refer line no. 12), aur usse hum Demo1 and
  Demo2 ki methods and constructor ko call karenge (Demo2 extends Demo1).
- Agar humne Demo1 me non-parameterized constructor ko comment kar diya to is class me
  constructor error show karne lagega. Isliye vo error hatane ke liye hume ek to Demo1
  class me ek to non-parameterized constructor bana padega (zero parameter constructor
  ki comment hatakar) nahi to is class me Demo1 ka parameterized constructor link
  karna padega (refer line no. 6).
- Jab bhi aap extend karte ho to by-default super class ke constructor ko call jayega hi
  jayega.
 */
