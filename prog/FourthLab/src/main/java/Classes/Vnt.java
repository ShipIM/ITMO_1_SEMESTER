package Classes;

import Enums.Place;
import Exceptions.ScenarioException;
import Interfaces.AbleToMove;
import Interfaces.AbleToUse;
import Interfaces.UseAble;

public class Vnt extends Human implements AbleToMove, AbleToUse {
    private static Vnt vnt;

    private Vnt(String name, Place place) {
        super(name, place);
    }

    public static Vnt getInstance() {
        if (vnt == null) {
            vnt = new Vnt("Vintik", Place.CABIN);
        }
        return vnt;
    }

    @Override
    public void currentPosition() {
        System.out.println(vnt.name + " is watching action.");
        if (place != Place.CABIN) {
            throw new ScenarioException("Wrong starting place");
        }
    }

    @Override
    public void setPlace(Place place) {
        this.place = place;
        System.out.println(name + " moves to " + place.name);
    }

    @Override
    public Place getPlace() {
        return place;
    }

    @Override
    public void useAccess(UseAble useAble) {
        System.out.println(name + " is using " + useAble.getUseName());
    }
}
