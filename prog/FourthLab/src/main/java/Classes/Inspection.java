package Classes;

import Enums.Place;
import Exceptions.SomethingGoesWrongException;
import Interfaces.InspectAble;

import java.util.ArrayList;
import java.util.Arrays;

public class Inspection extends Event {
    Consumables.Ammonia ammonia = new Consumables.Ammonia("ammonia");
    Consumables.OxygenTank oxygenTank = new Consumables.OxygenTank("oxygen tank");
    Consumables.RubberCushion rubberCushion = new Consumables.RubberCushion("rubber cushion");

    public void start() {
        starterPack();
        thingAreGettingWorse();
        whatAreYou();
        try {
            needOxy();
        } catch (SomethingGoesWrongException e) {
            e.printStackTrace();
        }
        rescuingFolk();
    }

    public void thingAreGettingWorse() {
        ArrayList<InspectAble> buddy = new ArrayList<>(Arrays.asList(Dnkw.getInstance().getEyes(),
                Dnkw.getInstance().getChest(), Dnkw.getInstance().getBreath(),
                Dnkw.getInstance().getCheeks(), Dnkw.getInstance().getHeart()));
        for (InspectAble parts : buddy) {
            infoHelp.getInfo(parts);
        }
        Dnkw.getInstance().setHealth(Dnkw.Health.ALMOST_DEAD);
        System.out.println();
    }

    public void whatAreYou() {
        ArrayList<InspectAble> buddy = new ArrayList<>(Arrays.asList(Dnkw.getInstance().getChest(),
                Dnkw.getInstance().getBreath(), Dnkw.getInstance().getPulse()));
        int counter = 0;
        for (InspectAble parts : buddy) {
            if (counter < 2) {
                infoHelp.getInfo(parts);
            } else {
                break;
            }
            counter++;
        }

        Plkn.getInstance().initiateAction();
        Plkn.getInstance().touchSomebody(Dnkw.getInstance().getHands());
        Plkn.getInstance().noticeThat(Dnkw.getInstance().getPulse());
        Dnkw.getInstance().setHealth(Dnkw.Health.DEAD);

        Plkn.getInstance().useAccess(ammonia);
        ammonia.havePosEffect(Dnkw.getInstance().getNose());
        infoHelp.getInfo(Dnkw.getInstance().getEyes());
        Dnkw.getInstance().setHealth(Dnkw.Health.DEAD);
        infoHelp.getInfo(Dnkw.getInstance().getEyes());
        System.out.println();
        Plkn.getInstance().touchSomebody(Dnkw.getInstance().getShoulders());
        infoHelp.getInfo(Dnkw.getInstance().getShoulders());
        Plkn.getInstance().noticeThat(Dnkw.getInstance().getFace());
        Plkn.getInstance().touchSomebody(Dnkw.getInstance().getHands());
        Plkn.getInstance().getEar().touchSomething(Dnkw.getInstance().getChest());
        Plkn.getInstance().noticeThat(Dnkw.getInstance().getPulse());
        Plkn.getInstance().noticeThat(Dnkw.getInstance().getHeart());
        Plkn.getInstance().useAccess(ammonia);
        ammonia.haveNoEffect(Dnkw.getInstance());
        System.out.println();
    }

    public void rescuingFolk() {
        class Shorts extends Human {
            private String mood = "deep frustration";

            public Shorts(String name, Place place) {
                super(name, place);
            }

            public void setMood(String mood) {
                this.mood = mood;
            }

            public String getMood() {
                return mood;
            }

            @Override
            void currentPosition() {
                System.out.println(name + " are watching action with " + mood);
            }
        }

        Shorts shorts = new Shorts("Shorters", Place.CORRIDOR);

        shorts.currentPosition();

        int amount = (int) (Math.random() * 10);

        for (int i = 0; i < amount; i++) {
            Plkn.getInstance().doBreath();
            Plkn.getInstance().doGym();
            Plkn.getInstance().takeBreak();
            Plkn.getInstance().getEar().touchSomething(Dnkw.getInstance().getChest());
            Plkn.getInstance().noticeThat(Dnkw.getInstance().getHeart());
        }

        System.out.println("\n" + "It took a lot of time, but... ");

        Dnkw.getInstance().setHealth(Dnkw.Health.ALMOST_DEAD);
        Plkn.getInstance().noticeThat(Dnkw.getInstance().getBreath());
        Plkn.getInstance().doGym();
        infoHelp.getInfo(Dnkw.getInstance().getBreath());

        Plkn.getInstance().useAccess(rubberCushion);
        shorts.setMood("relief");
        shorts.currentPosition();
        infoHelp.getInfo(Dnkw.getInstance().getFace());
        infoHelp.getInfo(Dnkw.getInstance().getEyes());
    }

    public void starterPack() {
        Dnkw.getInstance().currentPosition();
        Plkn.getInstance().currentPosition();
        Shpn.getInstance().currentPosition();
        Vnt.getInstance().currentPosition();
        System.out.println();
    }


    public void needOxy() throws SomethingGoesWrongException {
        Shpn.getInstance().useAccess(rubberCushion);
        Shpn.getInstance().setPlace(Place.GAS_COMPARTMENT);
        Vnt.getInstance().setPlace(Place.GAS_COMPARTMENT);

        if (Vnt.getInstance().hashCode() == Shpn.getInstance().hashCode() &
                Vnt.getInstance().equals(Shpn.getInstance())) {
            Vnt.getInstance().useAccess(oxygenTank);
            rubberCushion.setCondition(Consumables.Fill.FILLED);
            System.out.println(rubberCushion.getCondition());
            oxygenTank.setCondition(Consumables.Fill.NON_FILLED);
            System.out.println(oxygenTank.getCondition());
            Vnt.getInstance().setPlace(Place.CABIN);
            Shpn.getInstance().setPlace(Place.CABIN);
        } else {
            throw new SomethingGoesWrongException("Wrong plot, fool!");
        }

        System.out.println();
    }

    private interface InfoHelp {
        void getInfo(InspectAble inspectAble);
    }

    InfoHelp infoHelp = a -> System.out.println(a.getOwnerName() + "'s " + a.getName() + " " + a.getCondition());

    /* InfoHelp inf = new InfoHelp() {
        @Override
        public void getInfo(InspectAble inspectAble) {
            System.out.println(inspectAble.getOwnerName() + "'s " + inspectAble.getName() + " "
                    + inspectAble.getCondition());
        }
    }; */
}
