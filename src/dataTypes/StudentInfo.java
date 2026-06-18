package dataTypes;

public class StudentInfo {
    static void main(String[] args) {
        //name, roll no, div, marks, per, result, attendance,

        //Variable declaration
        String name;
        int rollNo;
        char div;
        float per;
        boolean attendance;

        //Variable initialization
        name = "Akshay";
        rollNo = 21;
        div = 'B';
        per = 89.7f;
        attendance = true;

        //Print
        System.out.println("Name is " + name);
        System.out.println("Roll No is " + rollNo);
        System.out.println("Division is " + div);
        System.out.println("Percent is " + per);
        System.out.println("Attendance is " + attendance);
    }
}
