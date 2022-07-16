package MoveList;

import ru.ifmo.se.pokemon.*;

public class Headbutt extends PhysicalMove {
    public Headbutt () {
        type = Type.NORMAL;
        power = 60;
        accuracy = 100;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect e = (new Effect()).attack(0.0D).turns((int)(Math.random() * 4.0D + 1.0D)).chance(0.3);
        var1.setCondition(e);
    }

    protected String describe() {
        return "использует Headbutt";
    }
}
