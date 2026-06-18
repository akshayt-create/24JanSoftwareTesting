package logicalPrograms;

public class CountNumberOfWhiteSpace {

    static void main(String[] args) {
        String a = "A BCD E F GH I J";

        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                counter++;
            }
        }

        System.out.println("Total number of white spaces are " + counter);
        System.out.println("-------------------------------------");

//==============================================================================================

        String b = "Engineering";

        int counter1 = 0;
        String b1 = b.toLowerCase();        //***
        for (int i = 0; i < b.length(); i++) {
            if(b1.charAt(i) == 'e'){
                counter1++;
            }
        }

        System.out.println("Total number of 'e' in Engineering are " + counter1);
    }
}
