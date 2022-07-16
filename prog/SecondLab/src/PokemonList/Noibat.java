package PokemonList;

import MoveList.Bulldoze;
import MoveList.Charm;
import MoveList.Confide;
import ru.ifmo.se.pokemon.*;

public class Noibat extends Pokemon {
    public Noibat(String name, int lvl) {
        super(name, lvl);
        setStats(40.0, 30.0, 35.0, 45.0, 40.0, 55.0);
        setType(Type.FLYING, Type.DRAGON);
        setMove(new Bulldoze(), new Confide(), new Charm());
    }
}
