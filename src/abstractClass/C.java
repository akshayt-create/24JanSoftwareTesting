package abstractClass;

public class C extends B {

    static void main(String[] args) {
        C c = new C();      //we can create object of concrete class
        c.show1();          //method of B class
        c.show2();          //method of B class
        c.show3();          //method of C class
        c.show4();          //method of C class
        c.show5();          //method of C class
        c.show6();          //method of C class

    }

    @Override
    public void show3() {

    }

    public void show4() {

    }

    public void show5() {

    }

    public void show6(){

    }

    @Override
    public void show7() {

    }
}
/*
- Abstract class kabhi bhi akela aayega kya--> No, kyuki agar aapne abstract class
  create kiya hai to uske saat concrete class hona chahiye.
- The relation between concrete class and abstract class is, concrete class extends
  abstract class.
- Concrete class ke pass kitni methods rehni chahiye. Concrete class ka main use hai
  incomplete methods ko complete karna, to isliye concrete class ke pass abstract class
  ki incomplete methods honi hi chahiye on priority. Uskebad uske pass kitni bhi methods
  ho sakti hai (uski khudki aur abstract class ki).
- A single concrete class can have how many abstract class --> One, (muliple in multi level
  inheritance). (Multiple inheritance is not supported in java in class concept)
 */
