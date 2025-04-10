import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println("Inferno!");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println("Pyroball!");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println("Firelash!");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println("FlameThrower!");
    }
}
