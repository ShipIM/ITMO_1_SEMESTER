package PokemonList;

import MoveList.Harden;
import MoveList.Poison_Jab;
import MoveList.Scary_Face;
import MoveList.Thunder;
import ru.ifmo.se.pokemon.*;

public class Seviper extends Pokemon {
    public Seviper(String name, int lvl) {
        super(name,lvl);
        setStats(73.0, 100.0, 60.0, 100.0, 60.0, 65.0);
        addType(Type.POISON);
        setMove(new Thunder(), new Poison_Jab(), new Scary_Face(), new Harden());
    }
}
