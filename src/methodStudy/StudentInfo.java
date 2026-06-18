package methodStudy;

public class StudentInfo {
    static void main(String[] args) {
        studentData();
        studentData();
        studentData("Tilak", 1, 'B', 88.88f, true);
        studentData("Ishan", 12, 'C', 90, true);    //float value me point nahi hai to 'f' nahi likha to bhi chalega
    }


    //StudentInfo--> name(String), rollNo(int), div(char), marks(float), result(boolean)
    public static void studentData() {      //zero parameter method
        String name = "Surya";
        int rollNo = 63;
        char div = 'A';
        float marks = 99.99f;
        boolean result = true;

        System.out.println("==============================");
        System.out.println("Name is " + name);
        System.out.println("Roll no is " + rollNo);
        System.out.println("Division is " + div);
        System.out.println("Marks are " + marks);
        System.out.println("Result is " + result);
        System.out.println("==============================");
    }

    public static void studentData(String name, int rollNo, char div, float marks, boolean result) {
        //multi parameterized method
        System.out.println("==============================");
        System.out.println("Name is " + name);
        System.out.println("Roll no is " + rollNo);
        System.out.println("Division is " + div);
        System.out.println("Marks are " + marks);
        System.out.println("Result is " + result);
        System.out.println("==============================");
    }
}