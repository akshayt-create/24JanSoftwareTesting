package thisAndSuperKeywords;

public class A {
    int x = 100;

    public void display() {
        int x = 1;               //local variable
        int sum = x + 1;         //used local 'x' variable
        int sum1 = this.x + 1;   //used global 'x' variable
    }

    public static void sum() {
        int x = 1;               //local variable
        int sum = x + 1;         //used local 'x' variable
//        int sum1 = this.x + 1;   //used global 'x' variable(static method me this keyword use nahi kar sakte)
    }
}
