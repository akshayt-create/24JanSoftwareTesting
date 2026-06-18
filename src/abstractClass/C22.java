package abstractClass;

public class C22 extends C2 {

    @Override
    public void show7() {

    }
}
/*
- C2 class me to ek bhi abstract method nahi dikh rahi.
- Lekin C2 extends B to isliye C2 class B class ki abstract methods leke aaya hai.
----------------------------------------------------------------------------------------------
- Humne B class ki show3 and show6 (abstract methods) method ko C2 class me impliment kiya hai
  to hume C22 class me unhe impliment karne ki jarurat nahi hai (kyuki C22 extends C2). Lekin
  hume show7 method ko yaha pe impliment karna padega, kyuki use class C2 me impliment nahi kiya
  hai. (C22 extends C2 extends B)
- C22 class concrete class hai to hum usme main method likh sakte hai aur uska object bhi create
  kar sakte hai
- (C22 extends C2 extends B) isliy hum C22 ke objects se B, C2 and C22 ki methods ko access kar
  sakte hai.
 */
