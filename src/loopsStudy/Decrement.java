package loopsStudy;

public class Decrement {
    static void main(String[] args) {

        int p = 100;
        System.out.println("p --> " + p);
        System.out.println("=======================");

        //post decrement
        int l = p--;
        System.out.println("p --> " + p);
        System.out.println("l --> " + l);
        System.out.println("=======================");

        int q = 6;
        System.out.println("q --> " + q);
        System.out.println("=======================");

        //pre decrement
        int m = --q;
        System.out.println("q --> " + q);
        System.out.println("m --> " + m);
        System.out.println("======================");

        int z = -99;
        int a = z--;
        System.out.println("z --> " + z);
        System.out.println("a --> " + a);

    }
}
