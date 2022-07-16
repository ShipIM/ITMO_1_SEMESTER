package MoveList;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze () {
        type = Type.GROUND;
        power = 60;
        accuracy = 100;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect e = new Effect().stat(Stat.SPEED,-1);
        var1.setCondition(e);
    }

    protected String describe() {
        return "использует Bulldoze";
    }
}
