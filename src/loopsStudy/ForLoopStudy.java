package loopsStudy;

public class ForLoopStudy {
    static void main(String[] args) {
        /*
        for(initialization; condition; updation) {

        //body

        }
         */

        //I want to print msg 5 times
        //start = 1; condition <= 5; updation = ++

        for (int a = 1; a <= 5; a++) {
            System.out.println("Good Evening");
        }
        System.out.println("================");

        //table of 5
        //initialization=5; condition<=50; updating=var+5
        for (int x = 5; x <= 50; x += 5) {
            System.out.println(x);
        }
        System.out.println("================");

        //table of 5 in reverse order
        //initialization=50; condition>=5; updating=var-5
        for (int y = 50; y >= 5; y -= 5) {
            System.out.println(y);
        }
    }
}
