package variableStudy;


public class Y1Mistake {

    int a = 100;

    static void main(String[] args) {
        Y1 y = new Y1();        //Y1 class ka object hai
        y.mul();                //isliye sirf Y1 class ki methods ko hi call kar sakta hai

        Y1 y1 = new Y1();       //Y1 class ka object hai
        y1.sub();               //isliye sirf Y1 class ki methods ko hi call kar sakta hai
    }


    public void multiplication() {
        a = 8;
        int mul = a * 10;
        System.out.println(mul);
    }

    public void subtraction() {
        int sub = a - 10;
        System.out.println(sub);

        int sub1 = a - 20;
        System.out.println(sub1);
    }
}
