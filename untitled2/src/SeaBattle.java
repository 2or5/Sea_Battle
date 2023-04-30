import java.io.IOException;

public class SeaBattle{
    public static void main(String[] args) throws IOException {
      Ships player1 = new Player1();
      Ships player1Ships1 = new FourDeke();
      Ships player1Ships2 = new ThreeDeke();
      Ships player1Ships3 = new TwoDeke();
      Ships player1Ships4 = new OneDeke();
      Course strike = new Course();
      player1.fillShips();
      player1Ships1.arena();
//      player1Ships1.fillShips();
//      player1Ships2.fillShips();
      player1Ships3.fillShips();
      player1Ships4.fillShips();


      Course strike2 = new Course();
      Ships player2 = new Player2();
      Ships player2Ships1 = new FourDeke();
      Ships player2Ships2 = new ThreeDeke();
      Ships player2Ships3 = new TwoDeke();
      Ships player2Ships4 = new OneDeke();
      player2.fillShips();
      player2Ships1.arena();
//      player2Ships1.fillShips();
//      player2Ships2.fillShips();
      player2Ships3.fillShips();
      player2Ships4.fillShips();

      Course.shoots2("s");

      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("Хід 2-го гравця");
      strike.emptyArea();
      strike.shoots(Ships.area);
      System.out.println("Хід 1-го гравця");
      strike2.emptyArea();
      strike2.shoots(Ships.area);

    }
}
