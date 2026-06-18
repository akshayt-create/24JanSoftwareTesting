package controlFlowStatements;

public class MultipleConditions {
    static void main(String[] args) {
    /*
    &&                         |  ||
    false   false --> false    |  false   false --> false
    false   true  --> false    |  false   true  --> true
    true    false --> false    |  true    false --> true
    true    true  --> true     |  true    true  --> true
    */

        int marks = 7;
        if(marks>=8 && marks<=9){
            System.out.println("You got A grade");
        } else if (marks>=7 && marks<=8){
            System.out.println("You got B grade");
        } else if (marks>=5 && marks<=7){
            System.out.println("You got C grade");
        } else {
            System.out.println("You got D grade");
        }


        char input = 'z';
        if(input=='A' || input=='E' || input=='I' || input=='O' || input=='U'){
            System.out.println("Given alphabet is vowel");
        } else {
            System.out.println("Given alphabet is consonant");
        }


    }
}
/*
- By using '&&', '||' we can check multiple conditions at a time.
 */
