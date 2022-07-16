package PokemonList;

import MoveList.Blizzard;
import MoveList.Rest;
import ru.ifmo.se.pokemon.*;


public class Chimchar extends Pokemon {
    public Chimchar(String name, int lvl) {
        super(name,lvl);
        setStats(44.0, 58.0, 44.0, 58.0, 44.0, 61.0);
        addType(Type.FIRE);
        setMove(new Blizzard(), new Rest());
    }
}
