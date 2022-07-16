package MoveList;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public  Rest () {
        type = Type.PSYCHIC;
    }

    @Override
    protected void applySelfEffects(Pokemon var1) {
        var1.restore();
        Effect e = (new Effect()).condition(Status.SLEEP).attack(0.0D).turns(2);
        var1.setCondition(e);
    }

    protected String describe() {
        return ("использует Rest");
    }
}
