package inheritance;

public class Mother {

    String bloodGroup = "AB+";

    public void nature(){
        System.out.println("Mother's nature");
    }

    public static void height(){
        System.out.println("Mother's height");
    }

    static void main(String[] args) {

        Mother mother = new Mother();
        mother.nature();
        height();

        //Here we cannot access the properties of Son class because Mother cannot extend Son


    }
}

