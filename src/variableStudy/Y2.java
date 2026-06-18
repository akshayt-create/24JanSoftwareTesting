package variableStudy;

public class Y2 {
    static int a = 90;

    static void main(String[] args) {
        Y2 y = new Y2();
        y.mul();

        Y2 y1 = new Y2();
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

        int sub1 = a - 10;
        System.out.println(sub1);
    }
}
