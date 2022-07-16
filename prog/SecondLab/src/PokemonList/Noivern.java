package PokemonList;

import MoveList.Headbutt;
import ru.ifmo.se.pokemon.*;

public class Noivern extends Noibat {
    public Noivern(String name, int lvl) {
        super(name, lvl);
        setStats(85.0, 70.0, 80.0, 97.0, 80.0, 123.0);
        setType(Type.FLYING, Type.DRAGON);
        addMove(new Headbutt());
    }
}
