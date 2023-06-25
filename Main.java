

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Player player1 = new PlayerHuman();
        Player player2 = new PlayerHuman();

        try{
            player1.setName("Kamil");
            player2.setName("Slimak");
        }
        catch (IllegalArgumentException ex){
            System.err.println("Błąd: " + ex.getMessage());
        }

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.play();


    }
}