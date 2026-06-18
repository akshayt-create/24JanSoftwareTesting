package interfaceStudy;

import polymorphism.Sample;

public interface Sample2 extends Sample1 {
    void test3();
    void test4();
}
/*
- interface can extend interface with the help of 'extends' keyword.
- Abhi 'Sample2' bhi ek interface hai to hum 'Sample1' ke methods ya pe complete
  nahi kar sakte.
- To hume ek implementation class create karna padega.
 */
