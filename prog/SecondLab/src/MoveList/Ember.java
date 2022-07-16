package MoveList;

import ru.ifmo.se.pokemon.*;

public class Ember extends SpecialMove {
    public  Ember () {
        type = Type.FIRE;
        power = 40.0;
        accuracy = 100.0;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        if (!var1.hasType(Type.FIRE)) {
            Effect e = (new Effect()).condition(Status.BURN).turns(-1).stat(Stat.ATTACK, -2).stat(Stat.HP,
                    (int)var1.getStat(Stat.HP) / 16).chance(0.1);
            var1.setCondition(e);
        }
    }

    protected String describe() {
        return ("использует Ember");
    }
}
