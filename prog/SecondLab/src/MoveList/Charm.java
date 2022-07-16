package MoveList;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm () {
        type = Type.FAIRY;
        accuracy = 100;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect e = new Effect().stat(Stat.ATTACK,-2);
        var1.setCondition(e);
    }

    protected String describe() {
        return "использует Charm";
    }
}
