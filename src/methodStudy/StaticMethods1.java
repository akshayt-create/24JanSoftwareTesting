package methodStudy;

public class StaticMethods1 {
    static void main(String[] args) {
        //to call static methods from same class
        //call with methodName()
        a();

        //you can call it multiple times
        //and it runs that much times
        a();
        a();
        a();

        //to call static regular methods from another class
        //Classname.methodName();
        StaticMethod2.b();  //method called from another class
        StaticMethod2.c();
        StaticMethod2.a();  //method with same name but from another class

        //you can call static regular methods from another class multiple times
        StaticMethod2.b();
        StaticMethod2.b();
    }

    public static void a(){
        System.out.println("This is static regular method --> a");
    }

}
