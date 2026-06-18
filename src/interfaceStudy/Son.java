package interfaceStudy;

public class Son implements Father, Mother{         //Multiple inheritance

    static void main(String[] args) {
        Son son = new Son();
        son.hardwork();
        son.honesty();
        son.nature();
        son.look();
        son.love();
        Father.kindness();      //Static method from Father interface
        Mother.kindness();      //Static method from Mother interface
    }

    @Override
    public void hardwork() {
        System.out.println("Father's hardwork completed in Son class");
    }

    @Override
    public void honesty() {
        System.out.println("Father's honesty completed in Son class");
    }


    @Override
    public void nature() {
        System.out.println("Mothers's nature completed in Son class");
    }

    @Override
    public void look() {
        System.out.println("Mother's look completed in Son class");
    }

    @Override
    public void love() {
        Father.super.love();
        Mother.super.love();
    }

//    @Override
//    public void kindness() {
//
//    }
    //Static methods ko hum override nahi kar sakte
}
/*
- Upar jitne interfaces create karna hai utne karo, un sabko hum ek class me implement
  kar sakte hai. Matlab, [Son implements Father, Mother, _____, _______, ______,......]
  (multiple inheritance)
- Agar yaha pe (Son class me) ek bhi method implementation karne ki chod dete to is
  (Son class) ko abstract class banana padta. Aur uska separate concrete class banana
  padta.
--------------------------------------------------------------------------------------------
- Hum son class ka object bana sakte hai.
 */
