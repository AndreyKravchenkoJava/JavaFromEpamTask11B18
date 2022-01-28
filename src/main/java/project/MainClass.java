package project;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("BMW", 5, 200));
        autos.add(new Auto("TOYOTA", 3, 130));
        autos.add(new Auto("FORD",  7, 120));
        autos.add(new Auto("DODGE", 4, 300));
        autos.add(new Auto("SUBARU", 8, 80));

       autos.sort(new CompareAuto());

        int overtaking = 0;

        for (int i = 0; i < autos.size(); i++) {
            for (int j = i + 1; j < autos.size(); j++) {
                if (autos.get(i).getFirstPosition() < autos.get(j).getFirstPosition() && autos.get(i).getSpeed() > autos.get(j).getSpeed()) {
                    overtaking++;
                }
            }
        }

        System.out.println(autos);
        System.out.println("Quantity overtaking: " + overtaking);
    }
}
