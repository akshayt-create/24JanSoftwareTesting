package dataTypes;

public class DataTypeStudy {
    static void main(String[] args) {

        //Primitive data types

        byte wickets;   //Variable declaration
        wickets = 8;    //Variable assignment
        System.out.println(wickets);
        System.out.println(10); //We can print numbers directly without double quotes ("___")
        System.out.println('A');
        System.out.println("wickets");  //String (we cannot print words without double quotes)
        System.out.println("Wickets are " + wickets); //Concatenation

        int rollNo;
        rollNo = 21;
        System.out.println("My Roll No is " + rollNo);

        short noOfCars;
        noOfCars = 2000;
        System.out.println("My No of Cars are " + noOfCars);

        long noOfPeoples;
        noOfPeoples = 1460000000;
        System.out.println("No of Peoples are " + noOfPeoples);
    }
}
