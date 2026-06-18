package abstractClass;

public class D extends B {

    @Override
    public void show3() {

    }

    @Override
    public void show6() {

    }

    @Override
    public void show7() {

    }
}
/*
- Ek abstract class ke multiple concrete class ho sakte hai. Par minimum ek concrete
  class hona hi chahiye, multiple nahi bhi rahenge to bhi chalega.
- Lekin jitne bhi concrete class rahenge un sabme abstract class ki sabhi abstract
  methods ko implement karna hi padega. Jo-jo extend karega un sabko implement karna
  hi padega (ek concrete class me impliment kiya to baki concrete class me impliment
  karne ki jarurat nahi padegi aisa nahi hoga). Nahi kiya to vo compile time error
  show karega.
- Isliye jab bhi aap concrete class create karenge to usme pehla kam implimentition ka
  karna hi padega.
 */
