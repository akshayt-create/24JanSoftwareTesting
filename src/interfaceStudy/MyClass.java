package interfaceStudy;

public class MyClass implements MyInterface {

    static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.test();
        myClass.test2();
    }

    @Override
    public void test() {
        System.out.println("Interface method completed in implementation class");
    }

    @Override
    public void test5() {
        System.out.println("Interface method completed in implementation class");
    }

    public void test3(){
        System.out.println("Own method of implementation (MyClass) class");
    }

}
/*
- Interface ko implement karne ke liye normal class ki jarurat hoti hai.
- Interface ko hum 'implements' keyword se implement karte hai.
- Interface and implementation class ke bich me 'implements' keyword rahega.
- 'implements' keyword ke aage sirf interface ka hi name aayega. Uske aage
  hum class (normal class) ka name nahi likh sakte.
- Jabtak hum interfaces (MyInterface) ki sari abstract methods ko 'MyClass'
  me implement nahi karte tabtak 'MyClass' error show karega.
---------------------------------------------------------------------------------
- Agar interface sari abstract methods ko hum is (implementation) class me impliment
  nahi karte hai to hume is class ko abstract class banana padega.
- Aur is class ko concrete class me extend karna padega 'extends' keyword ke through.
  Matlab interface aur class (implementation class) ke bich 'implements' keyword
  aayega. Aur class (abstract class) and class (abstract/concrete) ke bich 'extends'
  keyword aayega.
---------------------------------------------------------------------------------
- Hum implementation class (MyClass) ka object create kar sakte hai.
---------------------------------------------------------------------------------
- Implementation class ki khud ki methods ho sakti hai (test3 method).
----------------------------------------------------------------------------------
- Interface me percentage of abstraction fixed hota hai, aur abstract class me varying
  hota hai.
 */
