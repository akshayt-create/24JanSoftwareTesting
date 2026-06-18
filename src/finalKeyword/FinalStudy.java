package finalKeyword;

public class FinalStudy {

//  final int d;
    final int e = 10;
    int f;
    final int g;

    public FinalStudy(int g){
        this.g = g;
    }

    static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        a = a + 1;          //reinitialization(because variable can handle only one information at a time)
        System.out.println(a);

        final int b = 9;
        System.out.println(b);
//      b = b + 1;
//      System.out.println(b);

        final int c;
        c = 10;
//      c = 10 + 1;
    }

}
/*
- We cannot reinitialize final elements (refer line no. 23).
- Jo elements final rahete hai unko hum value sirf ek bar hi de sakte hai (line no. 21).
- Final variables ko hum sirf declare karke bhi chod sakte hai(sirf local variables ki
  condition me) aur bad me use ek bar initialized kar sakte hai.
- Lekin global variable ki condition me hum final global variables ko sirf declare karke
  nahi chod sakte (line no. 5). Ek to hume unhe declare karte time par hi initialized karna
  padega (line no. 6) ya unhe constructor ke through initialized karna padega (line no. 8)
  ya unhe non-final banana padega (linee no. 7).
-------------------------------------------------------------------------------------------------
- Jab hume variables ka bar-bar initialization rokna hai tab hum unhe final banate hai.
-------------------------------------------------------------------------------------------------
- We can write 'final' in front of class.
- Agar aapne class ko final kar diya to aap use inherit nahi kar sakte/extend nahi kar sakte.
--------------------------------------------------------------------------------------------------
- To jab hum variables ke samne final likte hai to hum uske reinitialization ko restrick karte
  hai.
- Jab hum methods ke samne final likhte hai tab hum uske overriding ko restrict karte hai.
- Aur jab hum class ke samne final likhte hai tab hum use ke inheritance ko restrict karte hai.
--------------------------------------------------------------------------------------------------
- Hum final class ko extend nahi kar sakte it doesn't mean hum uska object nahi bana sakte.
- Final class ka logo alag hota hai.
 */
