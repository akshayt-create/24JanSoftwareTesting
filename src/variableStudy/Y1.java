package variableStudy;

public class Y1 {
    int a = 90;

    static void main(String[] args) {
        Y1 y = new Y1();
        y.mul();

        Y1 y1 = new Y1();
        y1.sub();
    }

    public void mul(){
        a = 8;
        int mul = a * 10;
        System.out.println(mul);
    }

    public void sub(){
        int sub = a - 10;
        System.out.println(sub);

        int sub1 = a - 20;
        System.out.println(sub1);
    }
}
