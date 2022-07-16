package Classes;

import Enums.Place;
import Interfaces.AbleToUse;
import Interfaces.InspectAble;
import Interfaces.UseAble;

public class Plkn extends Human implements AbleToUse {
    private Ear ear = null;

    private static Plkn plkn;

    private Plkn(String name, Place place) {
        super(name, place);
    }

    public static Plkn getInstance() {
        if (plkn == null) {
            plkn = new Plkn("Pillulkin", Place.CABIN);
        }
        return plkn;
    }

    public Ear getEar() {
        if (ear == null) {
            ear = new Ear();
        }
        return ear;
    }

    public void noticeThat(InspectAble inspectAble) {
        System.out.println(name + " noticed that " + inspectAble.getOwnerName() + "'s " + inspectAble.getName()
                + " " + inspectAble.getCondition());
    }

    public void touchSomebody(InspectAble inspectAble) {
        System.out.println(plkn.name + " touches " + inspectAble.getOwnerName() + "'s " + inspectAble.getName());
    }

    public void doBreath() {
        System.out.println(name + " is doing artificial respiration");
    }

    public void doGym() {
        System.out.println(name + " plays with patient's hands or whatever");
    }

    public void initiateAction() {
        System.out.println(name + " has noticed that something goes wrong");
    }

    public void takeBreak() {
        System.out.println(name + " takes a small break");
    }

    @Override
    public void currentPosition() {
        System.out.println(plkn.name + " is looking after patient");
    }

    @Override
    public void useAccess(UseAble useAble) {
        System.out.println(name + " is using " + useAble.getUseName());
    }

    public class Ear extends BodyParts {
        public Ear() {
            name = "ear";
            condition = "is used";
        }

        public void touchSomething(InspectAble inspectAble) {
            System.out.println(Plkn.this.name + " is touching " + inspectAble.getName() + " with " + name);
        }
    }
}
