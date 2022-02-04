package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("BMW", 5, 200));
        autos.add(new Auto("TOYOTA", 3, 130));
        autos.add(new Auto("FORD",  7, 120));
        autos.add(new Auto("DODGE", 4, 260));
        autos.add(new Auto("SUBARU", 8, 300));
        System.out.println(autos);

       autos.sort(new CompareAuto());

       Overtaking overtaking = new Overtaking();
       overtaking.overtaking(autos);
    }
}
