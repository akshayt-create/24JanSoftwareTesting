package controlFlowStatements;

public class SwitchCaseStudy {
    static void main(String[] args) {
        //1-->Jan
        //12-->Dec

        int month = 4;
        switch (month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:    //default condition is optional
                System.out.println("Please enter a valid month number between 1 to 12");
                break;
        }


        //seasons--> summer, winter, rainy
        //summer--> turn on AC
        //winter--> turn on heater
        //rainy--> turn on umbrella

        String season = "xyz";
        switch (season) {
            case "summer":
                System.out.println("Turn ON AC");
                break;

            case "winter":
                System.out.println("Turn ON heater");
                break;

            case "rainy":
                System.out.println("Turn ON umbrella");
                break;

            default:
                System.out.println("Please enter a valid season");
                break;
        }


        //A--> English Medium
        //B--> Semi-english Medium
        //C--> Marathi

        char division = 'S';
        switch (division) {
            case 'A':
                System.out.println("English Medium");
                break;

            case 'B':
                System.out.println("Semi-english Medium");
                break;

            case 'C':
                System.out.println("Marathi Medium");
                break;

            default:
                System.out.println("Please enter division A-C");
                break;
        }
    }
}


/*
- Default condition is optional. If you don't write default condition compiler do not
  show error.
- But 'break' is not optional. If you don't write 'break' then compiler don't show error,
  but it executes other conditions till it hits the break.
- Also default condition don't need break, because after default condition there is nothing
  to execute. Even though we can write 'break' in default condition.
- Jis type ka condition given hai, usi type ka case condition rahega.
- Hum sirf '==' condition ke liye switch case use kar sakte hai.
- 'if-else' always boolean check karta hai but, 'switch' sirf same data type ki values compare
  karta hai vo boolean check nahi karta hai.
 */

