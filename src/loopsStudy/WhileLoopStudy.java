package loopsStudy;

public class WhileLoopStudy {
    static void main(String[] args) {

        //I want to print velocity 5 times
        //initialization = 1; condition <= 5; updation++
        int a = 1;          //initialization
        while (a <= 5) {    //condition
            System.out.println("Velocity");
            a++;            //updation
        }
        System.out.println("========================");

        //table of 3
        //initialization = 3; condition <= 30; updation b=b+3
        int b = 3;
        while (b <= 30) {
            System.out.println(b);
            b += 3;
        }
        System.out.println("========================");

        //table of 5 in reverse order
        //initialization = 50; condition >= 5; updation c=c-5
        int c = 50;
        while (c >= 5) {
            System.out.println(c);
            c -= 5;
        }
    }
}
