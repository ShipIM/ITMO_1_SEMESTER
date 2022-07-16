package Main;

import PokemonList.*;
import ru.ifmo.se.pokemon.Battle;

public class SecondLab {
    public static void main (String [] arg) {
        Battle b = new Battle();

        Seviper p1 = new Seviper("Змiй",1);
        Infernape p2 = new Infernape("Инферномат",1);
        Monferno p3 = new Monferno("Оберно", 1);
        Noibat p4 = new Noibat("Мышь", 1);
        Noivern p5 = new Noivern("Мырна", 1);
        Chimchar p6 = new Chimchar("ЧимСтринг", 1);

        b.addAlly(p1);
        b.addAlly(p4);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p6);

        b.go();
    }
}
