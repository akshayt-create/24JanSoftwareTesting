package castingStudy;

public class PrimitiveCasting {

    static void main(String[] args) {

        byte a = 10;
        System.out.println(a);

        //implicit casting
        //lower --> higher
        //memory --> increase --> widening casting
        //no data loss

        int b = a;
        System.out.println(b);

        double c = a;
        System.out.println(c);
        System.out.println("===============================");

        //explicit casting
        //higher --> lower
        //memory --> decrease --> narrowing casting
        //may data loss possible

        double p = 12.981;
        System.out.println(p);

        short q = (short) p;
        System.out.println(q);
    }
}
