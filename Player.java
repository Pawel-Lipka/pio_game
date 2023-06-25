

abstract public class Player {


     public Player() {}

    public Player (String name){
         setName(name);
    }
     private String name = "Domyślny";

     public  String getName(){
         return name;
     }

     public void setName(String name){
         if (name!= null && name.matches("^[A-Z][a-z]{1,12}")){
             this.name = name;
         }
         else {
             throw new IllegalArgumentException("Błędne imię");
         }
     }
     abstract public int guess();
}
