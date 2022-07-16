package Classes;

import Interfaces.UseAble;

public abstract class Consumables extends Thing implements UseAble {
    public Consumables() {
    }

    public Consumables(String name) {
        super(name);
    }

    public static class Ammonia extends Consumables {
        public Ammonia() {
        }

        public Ammonia(String name) {
            super(name);
        }

        public void havePosEffect(Dnkw.AffectAble affectAble) {
            affectAble.changeSelfCond();
            System.out.println(this.name + " has positive effect on " + affectAble.getOwnerName());
        }

        public void haveNoEffect(Human human) {
            System.out.println(name + " has no effect on " + human.getName());
        }

        @Override
        public String getUseName() {
            return name;
        }
    }

    public static class OxygenTank extends Consumables implements FillAble {
        private Fill condition;

        public OxygenTank() {
            condition = Fill.FILLED;
        }

        public OxygenTank(String name) {
            super(name);
            condition = Fill.FILLED;
        }

        @Override
        public String getCondition() {
            return name + " " + condition.name;
        }

        @Override
        public void setCondition(Consumables.Fill condition) {
            this.condition = condition;
        }

        @Override
        public String getUseName() {
            return name;
        }
    }

    public static class RubberCushion extends Consumables implements FillAble {
        private Fill condition;

        public RubberCushion() {
            condition = Fill.NON_FILLED;
        }

        public RubberCushion(String name) {
            super(name);
            condition = Fill.FILLED;
        }

        @Override
        public String getCondition() {
            return name + " " + condition.name;
        }

        @Override
        public void setCondition(Consumables.Fill condition) {
            this.condition = condition;
        }

        @Override
        public String getUseName() {
            return name;
        }
    }

    enum Fill {
        FILLED("is filled with oxygen"),
        NON_FILLED("is out of oxygen in it");

        private final String name;

        Fill(String name) {
            this.name = name;
        }
    }

    public interface FillAble {
        String getCondition();

        void setCondition(Consumables.Fill condition);
    }
}
