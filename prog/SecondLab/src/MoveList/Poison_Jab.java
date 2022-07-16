package MoveList;

import ru.ifmo.se.pokemon.*;


public class Poison_Jab extends PhysicalMove {
    public Poison_Jab () {
        type = Type.POISON;
        power = 80;
        accuracy = 100;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        if (!var1.hasType(Type.POISON) && !var1.hasType(Type.STEEL)) {
            Effect e = (new Effect()).condition(Status.POISON).turns(-1).stat(Stat.HP,
                    (int)var1.getStat(Stat.HP) / 8).chance(0.3);
            var1.setCondition(e);
        }
    }

    protected String describe() {
        return "использует Poison Jab";
    }
}
