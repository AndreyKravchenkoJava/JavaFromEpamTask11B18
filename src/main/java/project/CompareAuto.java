package project;

import java.util.Comparator;

public class CompareAuto implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return Integer.compare(o1.getFirstPosition(), o2.getFirstPosition());
    }
}
