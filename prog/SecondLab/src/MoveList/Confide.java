package MoveList;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide () {
        type = Type.NORMAL;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK,-1);
        var1.setCondition(e);
    }

    protected String describe() {
        return "использует Confide";
    }
}
