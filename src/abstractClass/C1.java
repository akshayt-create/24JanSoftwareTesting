package abstractClass;

public abstract class C1 extends B {

    static void main(String[] args) {
        C c = new C();
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
}
/*
- Lekin abstract class me dusre class ka (non-abstract) object bana sakte hai.
 */
