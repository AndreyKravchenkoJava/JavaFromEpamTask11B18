package project;

import java.util.Objects;

public class Auto {
    private String name;
    private int firstPosition;
    private int speed;

    public Auto(String name, int firstPosition, int speed) {
        this.name = name;
        this.firstPosition = firstPosition;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getFirstPosition() {
        return firstPosition;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return firstPosition == auto.firstPosition && speed == auto.speed && Objects.equals(name, auto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstPosition, speed);
    }

    @Override
    public String toString() {
        return "Auto: " + "name= " + name + ", firstPosition= " + firstPosition + ", speed= " + speed;
    }
}
