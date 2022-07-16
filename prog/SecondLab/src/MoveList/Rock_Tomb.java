package MoveList;

import ru.ifmo.se.pokemon.*;

public class Rock_Tomb extends PhysicalMove {
    public  Rock_Tomb () {
        type = Type.ROCK;
        power = 60.0;
        accuracy = 95.0;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect e = new Effect().stat(Stat.SPEED, 1);
        var1.setCondition(e);
    }

    protected String describe() {
        return ("использует Rock Tomb");
    }
}
