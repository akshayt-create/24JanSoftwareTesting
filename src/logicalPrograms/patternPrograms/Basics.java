package logicalPrograms.patternPrograms;

import java.sql.SQLOutput;

public class Basics {

    static void main(String[] args) {

        //Printing single star
        System.out.println("*");
        System.out.println();

        //Printing star 5 times in seperate line
        for(int i = 0; i<5; i++){
            System.out.println("*");
        }
        System.out.println();

        //Printing 5 star in a single line
        for(int i = 0; i<5; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println();

        //Printing 5 stars in a single line with space between them
        for(int i = 0; i<5; i++){
            System.out.print("* ");
        }
    }
}
