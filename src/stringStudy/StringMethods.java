package stringStudy;

public class StringMethods {

    static void main(String[] args) {

//      1. length()
        //return type of length() method is 'int'
        //Returns the length of this string.
        // The length is equal to the number of Unicode code units in the string.
        System.out.println("'length()' method output");
        String a = "Velocity";
        System.out.println(a.length());     //it will not store the value
        int stringLength = a.length();    //return type of length() method is 'int'
        System.out.println("Length of string is " + stringLength);
        System.out.println("------------------------------------");

        String a1 = "";
        System.out.println(a1.length());

        String a2 = null;
//        System.out.println(a2.length());    //NullPointerException
        /*
        - Agar aap null object pe koi bhi operation perform karte ho to aapko
          'NullPointerException' aayega (runtime exception).
        - Aapko jaha pe bhi exception aayega uske aage aapka code nahi chalega.
        - Jaha pe bhi aapka runtime exception aayega uske aage ka code truncate
          hojata hai, aapka code uske aage jata hi nahi hai.
        */
        System.out.println("================================");

//      2. toUpperCase()
        //return type of toUpperCase() method is 'String'
        //Returns: the String, converted to uppercase.
        System.out.println("'toUpperCase()' method output");
        String b1 = "Testing";
        System.out.println(b1);
        System.out.println(b1.toUpperCase());
        String b2 = b1.toUpperCase();    //return type of toUpperCase() method is 'String'
        System.out.println(b2);
        System.out.println("================================");


//      3. toLowerCase()
        //return type of toLowerCase() method is 'String'
        //Returns: the String, converted to lowercase.
        System.out.println("'toLowerCase()' method output");
        System.out.println(b1.toLowerCase());    //return type of toLowerCase() method is 'String'
        System.out.println(b2.toLowerCase());
        System.out.println("================================");

//      4. equals()
        //equals() method compares content of strings.
        //'==' operator compares memory locations or memory references.
        //'==' is a boolean operator.
        //equals() method requires two objects to compare.
        //Return type of equals() method is 'boolean'.
        //equals() method is case sensitive method.
        System.out.println("'equals()' method output");
        String c1 = "Pune";
        String c2 = "Pune";
        String c5 = "pune";
        String c3 = new String("Pune");
        String c4 = new String("Pune");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c5));
        System.out.println(c1.equals(c3));
        System.out.println(c3.equals(c4));
        System.out.println(c5.equals(c4));
        System.out.println("-------------------");
        System.out.println("'==' operator");
        System.out.println(c1 == c2);
        System.out.println(c1 == c5);
        System.out.println(c1 == c4);
        System.out.println(c3 == c4);
        System.out.println("================================");

//      5. equalsIgnoreCase()
        //equalsIgnoreCase() method is not a case sensitive method.
        //return type of equalsIgnoreCase() method is 'boolean'
        //return type of equalsIgnoreCase() method is 'boolean'
        System.out.println("'equalsIgnoreCase()' method output");
        System.out.println(c1.equalsIgnoreCase(c2));
        System.out.println(c2.equalsIgnoreCase(c2));
        System.out.println(c2.equalsIgnoreCase(c1));
        System.out.println(c5.equalsIgnoreCase(c2));
        System.out.println(c4.equalsIgnoreCase(c2));
        System.out.println(c4.equalsIgnoreCase(c3));
        System.out.println(c1.equalsIgnoreCase(c4));
        System.out.println(c5.equalsIgnoreCase(c4));
        System.out.println("================================");

//      6. contains()
        //Returns true if and only if this string contains the specified sequence of char values.
        //return type of contains() method is boolean.
        System.out.println("'contains()' method output");
        String d1 = "Katraj";
        boolean result = d1.contains("aj");     //return type of contains() method is boolean.
        System.out.println(result);
        System.out.println(d1.contains("j"));
        System.out.println(d1.contains("tj"));
        System.out.println(d1.contains(""));        //*****
        System.out.println("------------------------------");

        String d2 = null;
        System.out.println(d2);
//        System.out.println(d2.contains("j"));
        //Jab bhi aap null object pe operation perform karte ho it throws
        //'nullPointerException'.
        System.out.println("------------------------------");

        String d3 = "";
        System.out.println(d3.contains("t"));
        System.out.println(d3.contains(""));
        System.out.println("================================");

//      7. isEmpty()
        //Jindagi me jo bhi method milegi jo 'is' se start hoti hai uska return type boolean hi hoga.
        //return type of isEmpty() method is 'boolean'.
        //Returns true if, and only if, length() is 0.
        System.out.println("'isEmpty()' method output");
        System.out.println(d3.isEmpty());
        System.out.println(d1.isEmpty());
        System.out.println("=============================");

//      8. isBlank()
        //return type of isBlank() method is 'boolean'.
        //Returns true if the string is empty or contains only white space codepoints, otherwise false.
        System.out.println("'isBlank()' method output");
        System.out.println(d3.isBlank());
        System.out.println("------------------------------");

        String e1 = " ";
        String e2 = "";
        String e3 = null;
        String e4 = "test";
        String e5 = "test   ";
        System.out.println(e1.length());
        System.out.println(e2.length());
//        System.out.println(e3.length());
        System.out.println(e4.length());
        System.out.println(e5.length());    //***
        System.out.println("------------------------------");

        System.out.println(e1.isEmpty());
        System.out.println(e1.isBlank());
        System.out.println(e2.isEmpty());
        System.out.println(e2.isBlank());
        System.out.println(e4.isEmpty());
        System.out.println(e4.isBlank());
        System.out.println("------------------------------");

        String e6 = "a";
        String e7 = "";
        String e8 = " ";
        System.out.println(e6.isEmpty());
        System.out.println(e6.isBlank());
        System.out.println(e7.isEmpty());
        System.out.println(e7.isBlank());
        System.out.println(e8.isEmpty());
        System.out.println(e8.isBlank());
        System.out.println("------------------------------");

        String e9 = "      a";
        String e10 = "                   ";
        System.out.println(e9.isEmpty());
        System.out.println(e9.isBlank());
        System.out.println(e10.isEmpty());
        System.out.println(e10.isBlank());
        System.out.println("================================");

//      9. charAt()
        //return type of charAt() method is 'char'.
        /*
        - Returns the char value at the specified index. An index ranges from 0 to length() - 1.
         The first char value of the sequence is at index 0, the next at index 1, and so on, as
         for array indexing.
       - If the char value specified by the index is a surrogate, the surrogate value is returned.
       - Returns: the char value at the specified index of this string. The first char value is at
         index 0.
       - Throws: IndexOutOfBoundsException – if the index argument is negative or not less than the
         length of this string.
         */
        System.out.println("'charAt()' method output");
        String f1 = "Velocity Testing";
        char alpha = f1.charAt(0);
        System.out.println(alpha);
        System.out.println(f1.charAt(6));
        System.out.println(f1.charAt(9));
        System.out.println(f1.charAt(8));       //*** (blank space is present at index 8)
//        System.out.println(f1.charAt(90));    //StringIndexOutOfBoundsException (runtime)
//        System.out.println(f1.charAt(-7));    //StringIndexOutOfBoundsException (runtime)
        System.out.println(f1.charAt(14));
        System.out.println(f1.charAt(15));
//        System.out.println(f1.charAt(16));    //StringIndexOutOfBoundsException
        System.out.println("================================");

//      10. endsWith()      --> Tests if this string ends with the specified suffix.
//      11. startsWith()    --> Tests if this string starts with the specified prefix.
        System.out.println("'endsWith() and startsWith()' method output");
        //return type of endsWith() and startsWith() method is 'boolean'.
        //both methods are case-sensitive.
        String g1 = "Selenium";
        String g2 = "java";
        String g3 = "testing";
        String g4 = "";

        boolean str = g1.endsWith("um");
        System.out.println(str);
        System.out.println(g1.endsWith("uM"));
        System.out.println(g1.endsWith("m"));
        System.out.println(g1.endsWith("ium"));
        System.out.println(g1.endsWith("Selenium"));
        System.out.println(g1.endsWith("selenium"));
        System.out.println(g1.endsWith("ni"));
        System.out.println(g1.endsWith(""));        //***
        System.out.println(g4.endsWith(""));        //***
        System.out.println(g4.endsWith("m"));       //***
        /*
        Returns: true if the character sequence represented by the argument is a suffix of the
        character sequence represented by this object; false otherwise. Note that the result will
        be true if the argument is the empty string or is equal to this String object as determined
        by the equals(Object) method.
         */
        System.out.println("---------------------------------");

        System.out.println(g1.startsWith("Sel"));
        System.out.println(g1.startsWith("sel"));
        System.out.println(g1.startsWith("el"));
        System.out.println(g1.startsWith(""));
        /*
        Returns: true if the character sequence represented by the argument is a prefix of the
        character sequence represented by this string; false otherwise. Note also that true will
        be returned if the argument is an empty string or is equal to this String object as determined
        by the equals(Object) method.
         */
        System.out.println("================================");

//      12. substring()
        //.substring(int beginIndex)
        /*
        Returns a string that is a substring of this string. The substring begins
        with the character at the specified index and extends to the end of this
        string.
        */
        //return type of substring() method is 'String'.
        System.out.println("'substring()' method output");
        String h1 = "Velocity Corporate Training Centre";

        String sub = h1.substring(9);   //beginIndex se last tak jayega
        System.out.println(sub);
        System.out.println(h1.substring(9));
        System.out.println(h1.substring(33));
        System.out.println(h1.substring(34));       //*** --> returns "" (an empty string)
//        System.out.println(h1.substring(35));       //StringIndexOutOfBoundsException (runtime)
//        System.out.println(h1.substring(90));       //StringIndexOutOfBoundsException (runtime)
        /*
        Throws: IndexOutOfBoundsException – if beginIndex is negative or larger than the length of
        this String object.
         */
        System.out.println("---------------------------------");

        //.substring(int beginIndex, int endIndex)
        /*
        - Returns a string that is a substring of this string. The substring begins at the
          specified beginIndex and extends to the character at index endIndex - 1.
        - Thus the length of the substring is endIndex-beginIndex.
        - beginIndex –> the beginning index, inclusive.
          endIndex –> the ending index, exclusive.
        - Throws: IndexOutOfBoundsException – if the beginIndex is negative, or endIndex
          is larger than the length of this String object, or beginIndex is larger than
          endIndex.
         */
        String sub1 = h1.substring(9, 16);
        System.out.println(sub1);
        System.out.println(h1.substring(3, 14));
        System.out.println(h1.substring(19, 26));
        System.out.println(h1.substring(19, 27));
        System.out.println("================================");

//      13. concat()
        //return type of concat() method is 'String'
        System.out.println("'concat()' method output");
        String i1 = "Java";
        String i2 = "Testing";

        String merg = i1.concat(i2);
        System.out.println(merg);
        System.out.println(i1.concat(" ").concat(i2));
        System.out.println(i1.concat(" ").concat("Selenium ").concat(i2));
        System.out.println("Akshay".concat(" ").concat("Tilak"));
        String home = "Shrimayi".concat(" ").concat("Pooja");
        System.out.println(home);
        System.out.println("================================");

//      14(a). indexOf()
        //return type of indexOf() method is 'int'.
        //indexOf() method is case sensitive.
        /*Yaha pe ek chiz dhyan rakhne ki jarurat hai ki, agar aap koi dusra character
          pass karte ho jo string me nahi hai to ye method exception show nahi karegi,
          uske badle me '-1' show karegi. Kyuki ya pe range ke andar bahar aisa kuch nahi
          hai. '-1' matlab wrong (we are doing something wrong).*/
        //'-1' matlab hum usko kuch wrong parameter de rahe hai.
        System.out.println("'indexOf()' method output");
        String j1 = "Pune";
        int index = j1.indexOf("P");
        System.out.println(index);
        System.out.println(j1.indexOf("p"));
        System.out.println(j1.indexOf("e"));
        System.out.println(j1.indexOf("z"));
        System.out.println(j1.indexOf("o"));
        System.out.println(j1.indexOf("n"));
        System.out.println("-----------------------------------");

        String j2 = "Pune Velocity";
        System.out.println(j2.indexOf(" "));    //index of space
        System.out.println("-----------------------------------");

        String j3 = "testing";
        System.out.println(j3.indexOf("t"));
        /*
        - Returns: the index of the first occurrence of the specified substring, or -1
          if there is no such occurrence.
         */
        System.out.println("-----------------------------------");

        String j4 = "Testing";
        System.out.println(j4.indexOf("t"));
        System.out.println(j4.indexOf("T"));
        System.out.println("================================");

//      14(b). indexOf(int ch, int fromIndex)
        System.out.println("'indexOf(int ch, int fromIndex)' method output");
        String jb1 = "enginieering";
        System.out.println(jb1.indexOf('i', 1));
        System.out.println(jb1.indexOf('i', 3));
        System.out.println(jb1.indexOf('i', 4));
        System.out.println(jb1.indexOf('i', 6));
        System.out.println("================================");

//      14(c). indexOf(int ch, int beginIndex, int endIndex)
        System.out.println("'indexOf(int ch, int beginIndex, int endIndex)' method output");
        System.out.println(jb1.indexOf('e', 2, 9));
        System.out.println("================================");

//      14(d). indexOf(String str)
        System.out.println("'indexOf(String str)' method output");
        System.out.println(j4.indexOf("in"));
        System.out.println("================================");

//      14(e). indexOf(String str, int fromIndex)
        System.out.println("'indexOf(String str, int fromIndex)' method output");

        System.out.println("================================");


//      14(f). indexOf(String str, int beginIndex, int endIndex)
        String jf = "Engineering";
        System.out.println("'indexOf(String str, int beginIndex, int endIndex)' method output");
        System.out.println(jf.indexOf("in", 2, 9));
        System.out.println(jf.indexOf("in", 4, 9));     //***
        System.out.println(jf.indexOf("in", 4, 10));
//        System.out.println(jf.indexOf("in", 2, 20));    //StringIndexOutOfBoundsException
        System.out.println("================================");


//      15. lastIndeOf()
        /*
        - Returns: the index of the last occurrence of the character in the
          character sequence represented by this object, or -1 if the character
          does not occur.*/
        System.out.println("'lastIndexOf()' method output");
        String k1 = "Engineering";
        int ind = k1.lastIndexOf('e');
        System.out.println(ind);
        System.out.println(k1.lastIndexOf('E'));
        System.out.println(k1.lastIndexOf('i'));
        System.out.println(k1.lastIndexOf('n'));
        System.out.println("================================");


//      15(a). replace(char oldChar, char newChar)
        /*
        - replace() method is case sensitive
         */
        System.out.println("replace(char oldChar, char newChar) method output");
        String l = "Engineering";
        String replace = l.replace('e', '@');
        System.out.println(replace);
        System.out.println(l.replace('i', 's'));
//        System.out.println(l.replace('n', "AK"));
        /*
        - 'char' replace by "String" is not possible.
        - String replace(char, char)
        - String replace(CharSequence, CharSequence)
         */
        System.out.println(l.replace('r', 'e'));
        System.out.println(l.replace('E', 'e'));
        System.out.println("================================");

//      15(b). replace(CharSequence target, CharSequence replacement)
        System.out.println("replace(CharSequence target, CharSequence replacement)' method output");
        String bl = "Engineering";
        String replace1 = bl.replace("in", "$$");
        System.out.println(replace1);
        //String replace1 = bl.replace("in", 'k');      //replacing "String" with 'char' is not possible
        System.out.println(bl.replace("in", "Aks"));        //we can replace one string with another string of any length
        System.out.println(bl.replace("in", "A"));      //other wat to replace "String" with 'char'
        System.out.println("================================");

//      15(c). replaceFirst(String regex, String replacement)
        System.out.println("replaceFirst(String regex, String replacement) method output");
        String cl = "Engineering";
        String replace2 = cl.replaceFirst("in", "uuu");
        System.out.println(replace2);
        System.out.println("================================");

//       15(d). replaceAll(String regex, String replacement)
        System.out.println("replaceAll(String regex, String replacement) method output");
        String dl = "Engineering";
        String replace3 = dl.replaceAll("in", "oooo");
        System.out.println(replace3);


    }


}
/*
- String ek inbuild class hai, isliye string class ke khud ke kuch methods
  honge.
- String class is present in 'java.lang' package.
- Search for difference between '==' and'.equals'
 */
