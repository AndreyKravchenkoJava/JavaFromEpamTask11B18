package project;

import java.util.ArrayList;

public class Overtaking {

    public void overtaking(ArrayList<Auto> autos) {

        int overtaking = 0;
        for (int i = 0; i < autos.size(); i++) {
            for (int j = i + 1; j < autos.size(); j++) {
                if (autos.get(i).getFirstPosition() < autos.get(j).getFirstPosition() && autos.get(i).getSpeed() < autos.get(j).getSpeed()) {
                    overtaking++;
                }
            }
        }
        System.out.println("Quantity overtaking: " + overtaking);
    }
}
