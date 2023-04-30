import java.io.IOException;
import java.util.Scanner;

public interface Ships {
    Scanner scanner = new Scanner(System.in);
    public void arena();

    void fillShips() throws IOException;
    public String cell = " ⬜ ";
    public String blueCell = "\uD83D\uDFE6";
    public String oneShip = "\uD83D\uDEE5\uFE0F";
    String[][] area = new String[12][12];
}
