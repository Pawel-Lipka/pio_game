import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        Player player1 = new Player("Olisadebe");

        int number;
        int guess;
        Random rand = new Random();

        do {
            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            System.out.println("Gracz: " + guess);

            if (number == guess){
                System.out.println("Dobrze");
            }
            else {
                System.out.println("zle");}
        }
        while (number != guess);
    }
}