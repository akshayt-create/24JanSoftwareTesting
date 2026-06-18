package castingStudy;

public class ClassCastingStudy {

    static void main(String[] args) {

        Father father = new Father();
        father.car();
        father.bike();
        System.out.println("===========================");

        Son son = new Son();
        son.car();
        son.bike();
        son.education();
        System.out.println("==========================");

        //Up-casting
        Father son1 = new Son();
        son1.car();
        son1.bike();
//        son1.education();     //in up-casting we cannot call individual property of subclass
        son1.nature();      //but we can call individual property of parent class because of inheritance

    }
}
