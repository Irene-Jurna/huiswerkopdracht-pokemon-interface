import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";

    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println("Thunderpunch!");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println("Electroball!");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println("Thunder!");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println("Volttackle!");
    }
}
