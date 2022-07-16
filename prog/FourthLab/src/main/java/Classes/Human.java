package Classes;

import Enums.Place;

public abstract class Human extends Entity {
    protected Place place;

    public Human(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    abstract void currentPosition();

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        Human human = (Human) obj;

        return place == human.place;
    }

    @Override
    public int hashCode() {
        return place.hashCode();
    }
}
