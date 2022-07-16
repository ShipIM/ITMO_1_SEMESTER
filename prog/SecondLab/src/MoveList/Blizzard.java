package MoveList;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public  Blizzard () {
        type = Type.ICE;
        power = 110.0;
        accuracy = 70.0;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        if (!var1.hasType(Type.ICE)) {
            Effect e = (new Effect()).condition(Status.FREEZE).attack(0.0D).turns(-1).chance(0.1);
            var1.setCondition(e);
        }
    }

    protected void applySelfEffects(Pokemon var1) {
        if (!var1.hasType(Type.ICE)) {
            Effect e = (new Effect()).condition(Status.FREEZE).attack(0.0D).turns(-1).chance(0.1);
            var1.setCondition(e);
        }
    }

    protected void applySelfDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.HP, (int) Math.round(var2));
    }

    protected String describe() {
        return ("использует Blizzard");
    }
}
