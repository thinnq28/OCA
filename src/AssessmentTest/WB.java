package AssessmentTest;

import java.time.Period;

public class WB  {

    public static String a = "a";

    public static void main(String[] args) {
        MyAbstract.C();
//            FIRST_CHAR_LOOP:
//            for (int a = 1; a <= 4; a++) {
//                for (char x = 'a'; x <= 'c'; x++) {
//                    if (a == 2 || x == 'b') continue FIRST_CHAR_LOOP;
//                    System.out.print(" " + a + x);
//                }
//            }
        String A = "thin";
        String B = "thin";
        System.out.println(A == B);
        String C = new String("thin");
        String D = new String("thin");
        System.out.println(C == D);
    }


}
