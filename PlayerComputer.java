import java.util.Random;

public class PlayerComputer extends Player {

    private Random brain = new Random();

    public PlayerComputer() {};
    public PlayerComputer(String name) {

        super(name);
    }
    public int guess() {

        return brain.nextInt(6) + 1;
    }
}
