package Classes;

import Enums.Place;
import Interfaces.InspectAble;

public class Dnkw extends Human {
    private Health health;

    private static Dnkw dnkw;

    private Eyes eyes = null;
    private Chest chest = null;
    private Cheeks cheeks = null;
    private Heart heart = null;
    private Pulse pulse = null;
    private Breath breath = null;
    private Face face = null;
    private Shoulders shoulders = null;
    private Hands hands = null;
    private Nose nose = null;

    private Dnkw(String name, Place place, Health health) {
        super(name, place);
        this.health = health;
    }

    public static Dnkw getInstance() {
        if (dnkw == null) {
            dnkw = new Dnkw("Neznaika", Place.CABIN, Health.IN_BAD_CONDITION);
        }
        return dnkw;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;

        System.out.println(name + "'s condition now " + health.name);
    }

    public String getName() {
        return name;
    }

    public Eyes getEyes() {
        if (eyes == null) {
            this.eyes = new Eyes();
        }
        return eyes;
    }

    public Chest getChest() {
        if (chest == null) {
            chest = new Chest();
        }
        return chest;
    }

    public Cheeks getCheeks() {
        if (cheeks == null) {
            cheeks = new Cheeks();
        }
        return cheeks;
    }

    public Heart getHeart() {
        if (heart == null) {
            heart = new Heart();
        }
        return heart;
    }

    public Pulse getPulse() {
        if (pulse == null) {
            pulse = new Pulse();
        }
        return pulse;
    }

    public Breath getBreath() {
        if (breath == null) {
            breath = new Breath();
        }
        return breath;
    }

    public Face getFace() {
        if (face == null) {
            face = new Face();
        }
        return face;
    }

    public Shoulders getShoulders() {
        if (shoulders == null) {
            shoulders = new Shoulders();
        }
        return shoulders;
    }

    public Hands getHands() {
        if (hands == null) {
            hands = new Hands();
        }
        return hands;
    }

    public Nose getNose() {
        if (nose == null) {
            nose = new Nose();
        }
        return nose;
    }

    @Override
    public void currentPosition() {
        System.out.println(name + " is laying in the bed");
    }

    public enum Health {
        IN_BAD_CONDITION("is in bad condition"),
        ALMOST_DEAD("is almost dead"),
        DEAD("is dead"),
        IS_GOOD("is good");

        String name;

        Health(String name) {
            this.name = name;
        }
    }

    public class Eyes extends BodyParts implements InspectAble {
        String[] array = {"are opened", "are closed"};

        public Eyes() {
            name = "eyes";
        }

        @Override
        public String getCondition() {
            if (health == Health.IN_BAD_CONDITION || health == Health.DEAD) {
                condition = array[1];
            } else {
                condition = array[0];
            }

            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return Dnkw.this.getName();
        }
    }

    public class Chest extends BodyParts implements InspectAble {
        String[] array = {"heaves heavily", "is heaving less and less"};

        public Chest() {
            name = "chest";
        }

        @Override
        public String getCondition() {
            if (health == Health.IN_BAD_CONDITION || health == Health.IS_GOOD) {
                condition = array[0];
            } else {
                condition = array[1];
            }
            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return Dnkw.this.getName();
        }
    }

    public class Cheeks extends BodyParts implements InspectAble {
        String[] array = {"are filled with with a strange blush", "have normal colour"};

        public Cheeks() {
            name = "cheeks";
        }

        @Override
        public String getCondition() {
            if (health == Health.IN_BAD_CONDITION || health == Health.ALMOST_DEAD || health == Health.DEAD) {
                condition = array[0];
            } else {
                condition = array[1];
            }
            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return Dnkw.this.getName();
        }
    }

    public class Heart extends BodyParts implements InspectAble {
        String[] array = {"is beating slowly", "has stopped"};

        public Heart() {
            name = "heart";
        }

        @Override
        public String getCondition() {
            if (health == Health.IN_BAD_CONDITION || health == Health.ALMOST_DEAD || health == Health.IS_GOOD) {
                condition = array[0];
            } else {
                condition = array[1];
            }
            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return Dnkw.this.getName();
        }
    }

    public class Pulse extends BodyParts implements InspectAble {
        String[] array = {"is being felt", "is not palpable"};

        public Pulse() {
            name = "pulse";
        }

        @Override
        public String getCondition() {
            if (health == Health.IN_BAD_CONDITION || health == Health.IS_GOOD) {
                condition = array[0];
            } else {
                condition = array[1];
            }
            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return Dnkw.this.getName();
        }
    }

    public class Breath extends BodyParts implements InspectAble {
        String[] array = {"was slightly coming out of mouth", "has stopped"};

        public Breath() {
            name = "breath";
        }

        @Override
        public String getCondition() {
            if (health == Health.DEAD) {
                condition = array[1];
            } else {
                condition = array[0];
            }
            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return Dnkw.this.getName();
        }
    }

    public class Face extends BodyParts implements InspectAble {
        String[] array = {"has a strange pallor", "has normal colour"};

        public Face() {
            name = "face";
        }

        @Override
        public String getCondition() {
            if (health == Health.IN_BAD_CONDITION || health == Health.DEAD) {
                condition = array[0];
            } else {
                condition = array[1];
            }
            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return Dnkw.this.getName();
        }
    }

    public static class Nose implements AffectAble {
        String name;

        public Nose() {
            name = "nose";
        }

        @Override
        public void changeSelfCond() {
            Dnkw.getInstance().setHealth(Health.ALMOST_DEAD);
        }
    }

    public class Shoulders extends BodyParts implements InspectAble {
        public Shoulders() {
            name = "shoulders";
            condition = "are shaken";
        }

        @Override
        public String getCondition() {
            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return Dnkw.this.getName();
        }
    }

    public static class Hands extends BodyParts implements InspectAble {
        public Hands() {
            name = "hands";
            condition = "are captured";
        }

        @Override
        public String getCondition() {
            return condition;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getOwnerName() {
            return dnkw.getName();
        }
    }

    public interface AffectAble {
        void changeSelfCond();

        default String getOwnerName() {
            return Dnkw.getInstance().getName();
        }
    }
}