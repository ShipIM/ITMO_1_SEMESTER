package PokemonList;

import MoveList.Ember;
import ru.ifmo.se.pokemon.*;

public class Infernape extends Monferno {
    public Infernape(String name, int lvl) {
        super(name, lvl);
        setStats(76.0, 104.0, 71.0, 104.0, 71.0, 108.0);
        setType(Type.FIRE, Type.FIGHTING);
        addMove(new Ember());
    }
}
