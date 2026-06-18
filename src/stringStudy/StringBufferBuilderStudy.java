package stringStudy;

public class StringBufferBuilderStudy {

    static void main(String[] args) {

        String name = "Velocity";
        System.out.println(name);

        String name1 = name + " pune";
        System.out.println(name1);

        String name2 = name.replace("V", "H");
        System.out.println(name);
        System.out.println(name2);

        System.out.println("=========================\n");

        StringBuffer city = new StringBuffer("Mumbai");
        System.out.println(city);

        city.append(" MH");
        System.out.println(city);

        city.replace(7,9,"maharashtra");
        System.out.println(city);

        city.reverse();
        System.out.println(city);

        System.out.println("=========================\n");

        StringBuffer gender = new StringBuffer("Male");
        gender.append(" Gender");
        System.out.println(gender);

        gender.insert(0,"Test");
        System.out.println(gender);

        gender.delete(0,4);
        System.out.println(gender);


    }
}
