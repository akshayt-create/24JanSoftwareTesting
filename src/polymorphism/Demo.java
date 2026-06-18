package polymorphism;

public class Demo {
    static void main() {

    }
}
/*
- Can we overload main method? --> Yes. Lekin unmethods ke parameters alad-alag hone chahiye.
----------------------------------------------------------------------------------------------
- Agar ek method static hai aur ek method non-static hai (with same name but different
  parameters) to hum use method overloading keh sakte hai kya? --> Yes.
- Agar ek method static hai aur ek method non-static hai (with same name and same
  parameters) to vo methods duplicate ho jayengi. Kyuki methods me differentiate kare ke
  liye static and non-static matter nahi karte. Aur methods ki body method area me
  rehti hai to calling time me compiler issue karega, isiliye vo ise allowed nahi karta hai.
-----------------------------------------------------------------------------------------------
- Access specifiers ka aur overloading ka kuch bhi relation nahi hai.
- Hum private methods ko overload kar sakte hai kya? --> Yes. But vo methods same nahi with
  different parameters honi chahiye, kyuki access specifiers ka aur overloading ka kuch bhi
  relation nahi hai.
-----------------------------------------------------------------------------------------------
- Same return type ka bhi methods ko differentiate karne me koi bhi role nahi hota hai. Isliye
  jab methods exactly same hai bas return type different hai to vo duplicate methods hogi. Vo
  overloading nahi hogi. Overloading karne ke liye hume un methods ke parameters change (different)
  karne padege.
====================================================================================================
- Agar aapko overriding karna hai to kya jaruri hai? --> Inheritance. Kyuki overriding karne ke liye
  ek subclass jaruri hai.
- Can we override main method? --> No. Because overriding concept is only applicable for non-static
  methods.
- Overriding ke time aisi konsi chiz hai jo decide karti hai ki konsi method ko call kare? --> Object.
  To jab-bhi hum object ke bare me bolte hai to vo sirf non-static elements ke liye hota hai. Therefore,
  we can override only and only non-static methods.
- Aur jo bhi hum static declare karte hai (variables, methods) (constructor static nahi hota) vo remains
  with the class only.
 */
