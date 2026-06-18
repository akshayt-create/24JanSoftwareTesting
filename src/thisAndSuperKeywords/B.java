package thisAndSuperKeywords;

public class B extends A {
    int x = 999;        //global variable of B class
    //Lekin yaha pe ek mr. India chupa hai which is A class ka 'x' variable (because B extends A)

    int y = 8;

    public void show() {
        int x = 120;
        int sum1 = x + 1;           //local x variable used
        System.out.println(sum1);

        int sum2 = this.x + 1;      //global x variable of Class B is used
        System.out.println(sum2);
        //Agar subclass ke global variable ko comment kar diya (line no 4) to this.x super class ke
        //global variable ko point karega

        int sum3 = super.x + 1;     //global x variable of Class A is used
        System.out.println(sum3);
        //super keyword super class ke hi global variable ko point karega
        /*
        - Global variable of Class A and Class B ka name same hai (x) and local variable of
          Class B ka name bhi x hi hai isliye unme differentiate karne ke liye 'this', 'super'
          keyword ka use kiya hai.
         */

        int sum4 = y + 1;
        System.out.println(sum4);
        //yaha pe y variable ka koi bhi duplicate variable nahi hai, isliye hum use direct
        //call karsakte hai.

        super.display();        //calling class A display method using super keyword because we are in non-static method
    }

    static void main(String[] args) {
        B b = new B();
        b.display();

//      super.display();
        A a = new A();
        a.display();

        sum();
        /*
        - main method me super class ki static method ko direct call kar sakte hai kyuki we are
          in the same class.
        - Agar is class (subclass) me bhi sum name ki static method hoti to line no 44 me super
          class ki sum method call karne ke liye super class ka reference dena padta (A.sum) aise.
         */


        /*
        - Jab bhi super class and subclass me same name ki methods hongi to unhe call karne ke
          liye us class ke hi object ke through call karna padega. Matlab jis class ki method us
          class ke object ke through call karna padega.
        - Humne A class ki display method ko super keyword ke through call nahi kiya kyuki vo
          non-static method hai. Aur non-static elements ko call karne ke liye object ki jarurat
          padti hai.
        - Aur vaise bhi main method static hone ke wajehe se vo hume non-static elements ko direct
          call ya this ya super keyword (this.nonStaticElement and super.nonStaticElement) call karne
          ki permission nahi deti hai. (refer line no 37)
        - Lekin non-static context me hum non-static elements ko this ya super keyword se access kar
          sakte hai. (refer line no 30 and 37)
        - Toh hum aisa keh sakte hai ki static methods me 'this' keyword ki taraha 'super' keyword ka
          bhi kuch kaam nahi hai.
         */
    }

    public void display() {
        System.out.println("Hi");
    }
}

/*
- super keyword ka use karne ke liye aapke pass minimum inheritance concept hona cahiye aur inherited
  classes me duplicate elements hone chahiye.
 */
