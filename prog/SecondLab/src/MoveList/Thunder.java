package MoveList;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public  Thunder () {
        type = Type.ELECTRIC;
        power = 110.0;
        accuracy = 70.0;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        if (!var1.hasType(Type.ELECTRIC)) {
            Effect e = (new Effect()).condition(Status.PARALYZE).attack(0.75D).turns(-1).stat(Stat.SPEED,
                    -2).chance(0.3);
            var1.setCondition(e);
        }
    }

    protected String describe() {
        return ("использует Thunder");
    }
}
