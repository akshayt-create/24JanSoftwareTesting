package loopsStudy;

public class Increment {
    static void main(String[] args) {
        int x = 10;
        int y = 99;

        //post and pre increment
        System.out.println(x);
        System.out.println(y);

        int a = x;
        System.out.println("x --> "+ x);
        System.out.println("a --> "+ a);
        System.out.println("====================");

        //post increment
        int b = x++;        //first assignment then increment
        System.out.println("x --> " + x);
        System.out.println("b --> " + b);
        System.out.println("====================");

        //pre increment
        System.out.println("y --> " + y);
        int c = ++y;        //first increment then assignment
        System.out.println("y --> " + y);
        System.out.println("c --> " + c);



    }
}
