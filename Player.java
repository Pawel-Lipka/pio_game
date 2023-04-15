import java.util.Random;

public class Player {

     private Random brain = new Random();

     public Player() {}

    public Player (String name){
         setName(name);
    }
     private String name = "Domyślny";

     public  String getName(){
         return name;
     }

     public void setName(String name){
         if (name!= null && !name.isEmpty()){
             this.name = name;
         }
         else {
             System.out.println("Błędne imię ");
         }
     }
     public int guess(){
         return brain.nextInt(6) + 1;
     }
}
