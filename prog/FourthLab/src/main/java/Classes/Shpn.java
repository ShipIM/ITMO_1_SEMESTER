package Classes;

import Enums.Place;
import Exceptions.ScenarioException;
import Interfaces.*;

public class Shpn extends Human implements AbleToMove, AbleToUse {
    private static Shpn shpn;

    private Shpn(String name, Place place) {
        super(name, place);
    }

    public static Shpn getInstance() {
        if (shpn == null) {
            shpn = new Shpn("Shpuntik", Place.CABIN);
        }
        return shpn;
    }

    @Override
    public void currentPosition() {
        System.out.println(shpn.name + " is watching action.");
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
