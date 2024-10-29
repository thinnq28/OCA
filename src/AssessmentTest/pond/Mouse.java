package AssessmentTest.pond;

import java.util.ArrayList;
import java.util.List;

public class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }

    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
//        Mouse mouse = new Mouse(15);
//        mouse.print();
        List<String> a = new ArrayList<>();
        a.add("a");
        System.out.println(a);
        plus(a);
        System.out.println(a);

        String b = new String("a");
        plus(b);
        System.out.println(b);

    }

    private static void plus(List<String> a) {
        a.add("b");
    }

    private static void plus(String a) {
        a = a + "b";
    }
}