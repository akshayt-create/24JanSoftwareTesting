package methodStudy;

public class MethodReuse {
    static void main(String[] args) {
        MethodReuse methodReuse = new MethodReuse();
        methodReuse.addition();
        methodReuse.addition();
        methodReuse.addition(1, 1);
        methodReuse.addition(12, 13);
        methodReuse.addition(22);
    }

    public void addition(){     //method without parameters or zero parameter method
        int a = 10;
        int b = 1;
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }

    public void addition(int a, int b){     //method with parameters or parameterized method
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }

    public void addition(int a){     //method with parameters or method with single parameter
        int sum = 100 + a;
        System.out.println("Sum is " + sum);
    }

    /*
    -Here, we are giving same name to the methods. But compiler don't show error because, first addition method
     is non-parameterized and, second and third are parameterized methods.
    -And between second and third method, second is two parameterized and third is single parameterized method.
    -If parameterized methods with same name having same parameter types, then it shows error.
    -Even though, parameterized methods with same name and same parameter types don't show error when the sequence
     of the parameters in these methods are different.
    -Method Overloading:- Jab class me same name but different parameters ki 2 or 2 se jayda methods available
     ho to use method overloading kehate hai.
    */


}
