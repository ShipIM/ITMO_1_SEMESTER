package MoveList;

import ru.ifmo.se.pokemon.*;

public class Harden extends StatusMove {
    public Harden () {
        type = Type.NORMAL;
    }

    @Override
    protected void applySelfEffects(Pokemon var1) {
        Effect e = new Effect().stat(Stat.DEFENSE,1);
        var1.setCondition(e);
    }

    protected String describe() {
        return "использует Harden";
    }
}
