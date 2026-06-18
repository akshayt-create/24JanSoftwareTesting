package methodStudy;

public class ManacheJavai {
    static void main(String[] args) {
        motheJavai();   //calling static methods from same class
        officerJavai();
    }

    public void choteJavai() {  //non-static regular method
        System.out.println("Javai jevyala ya");
    }

    public static void motheJavai() {   //static regular method
        System.out.println("Javai saheb non-veg khayla ya");
    }

    public static void officerJavai() {
        System.out.println("Javai saheb Namaskar, tumchya sathi special arrangement karnayat aali ahe");
    }

}
