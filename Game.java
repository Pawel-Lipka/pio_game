import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Game {


    private Random dice = new Random();
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {

        players.add(player);
    }

    public void play() {

        boolean repeat;
        int number;
        int guess;

        do {

            number = dice.nextInt(6) + 1;
            System.out.println("Kostka: " + number);
            repeat = true;
            for (Player player : players ) {

                System.out.println(player.getName() + " podaj liczbę: ");
                guess = player.guess();
                System.out.println(player.getName()+ " " + guess);

                if (number != guess) {
                    System.out.println("zle");
                } else {
                    System.out.println("dorze");
                    repeat = false;
                    break;
                }
            }
        }
            while (repeat);

    }
}

