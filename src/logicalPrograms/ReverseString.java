package logicalPrograms;

public class ReverseString {

    static void main(String[] args) {

        String s = "Pune";
        System.out.println("Given string is " + s);

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char alpha =  s.charAt(i);
            reverse += alpha;
        }

        System.out.println("Reverse string: " + reverse);
    }
}
