package AssessmentTest.pond.swan;

import AssessmentTest.pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
// but subclass of bird
// package access to superclass // package access to superclass
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass System.out.println(other.text);// package access to superclass
    }

//    public void helpOtherBirdSwim() {
//        Bird other = new Bird();
//        other.floatInWater();
//        System.out.println(other.text);
//    }
}
