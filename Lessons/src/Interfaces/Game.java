package Interfaces;

public class Game {
  int id;
  Game(int id){
    this.id = id;
  }
  public static void main(String[] args) {
    Game gm = new Game(2);
    Game gm1 = new Game(3);
    System.out.println(gm.equals(gm1));
  }
  public boolean equals (Object obj){
    Game otherGAme = (Game) obj;
    return this.id == otherGAme.id;
  }



}



