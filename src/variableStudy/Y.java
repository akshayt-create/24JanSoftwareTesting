package variableStudy;

public class Y {
    int a = 90;

    static void main(String[] args) {
        Y y = new Y();
        y.mul();
        y.sub();
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
