import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";

    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println("Surf!");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println("Hydropump!");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println("Hydrocanon!");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println("Raindance!");
    }
}
