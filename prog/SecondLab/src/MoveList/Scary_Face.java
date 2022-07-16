package MoveList;

import ru.ifmo.se.pokemon.*;

public class Scary_Face extends StatusMove {

    public Scary_Face() {
        type = Type.NORMAL;
        accuracy = 100;
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
       Effect e = new Effect().stat(Stat.SPEED,-2);
       var1.setCondition(e);
    }

    protected String describe() {
        return "использует Scary Face";
    }
}
