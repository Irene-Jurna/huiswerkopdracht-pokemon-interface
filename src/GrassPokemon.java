import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println("Leafstorm!");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println("Solarbeam!");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println("Leechseed!");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println("Leaveblade!");
    }
}
