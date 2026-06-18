package loopsStudy;

public class DoWhileLoopStudy {
    public static void main(String[] args) {

        //I want to print velocity 3 times
        int a = 100;            //initialization
        do {
            System.out.println("Velocity");
            a++;                //updation
        } while (a <= 102);     //condition
        System.out.println("=======================");

        //table of 6
        int b = 6;
        do {
            System.out.println(b);
            b += 6;
        } while (b <= 60);
        System.out.println("=======================");

        //table of 6 in reverse order
        int c = 60;
        do {
            System.out.println(c);
            c -= 6;
        } while (c >= 6);
    }
}
