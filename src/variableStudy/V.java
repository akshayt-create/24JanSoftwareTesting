package variableStudy;

public class V {
    static void main(String[] args) {

        //Calling global variable from W class in V class
        W w = new W();      //jis class ka variable, us class ka object
        int mul = w.a * 2;  //calling non-static global variable with object name
        System.out.println(mul);

        int div = 100 / W.b;    //calling static global variable from another class directly with that class name
        System.out.println(div);

        //Calling methods from W class in V class
        w.addition();

    }
}
