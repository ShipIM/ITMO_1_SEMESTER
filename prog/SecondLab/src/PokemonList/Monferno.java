package PokemonList;

import MoveList.Rock_Tomb;
import ru.ifmo.se.pokemon.*;

public class Monferno extends Chimchar {
    public Monferno(String name, int lvl) {
        super(name, lvl);
        setStats(64.0, 78.0, 52.0, 78.0, 52.0, 81.0);
        setType(Type.FIRE, Type.FIGHTING);
        addMove(new Rock_Tomb());
    }
}
