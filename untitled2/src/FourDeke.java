import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FourDeke implements Ships {
    @Override
    public void arena() {
        for (int i=1; i<11; i++){
            for (int j=1; j<11; j++){
                area[i][j] = cell;
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public void fillShips() throws IOException {
        System.out.println("Введіть 4-х палубний корабль (формат: x,y;x,y;x,y;x,y)");
        String line = scanner.nextLine();
        if (line.length() !=15){
            System.out.println("Тобі потрібно ввести 4-х палубний корабль");
        }
        String[] coordinates = line.split("[,;]");
        for ( int i = 1; i<11; i++) {
            int x1 = Integer.parseInt(coordinates[0]);
            int y1 = Integer.parseInt(coordinates[1]);
            int x2 = Integer.parseInt(coordinates[2]);
            int y2 = Integer.parseInt(coordinates[3]);
            int x3 = Integer.parseInt(coordinates[4]);
            int y3 = Integer.parseInt(coordinates[5]);
            int x4 = Integer.parseInt(coordinates[6]);
            int y4 = Integer.parseInt(coordinates[7]);
                if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3)) {
                    System.out.println("Помилка! Введено дві однакові координати.");
                    throw new IOException();
                }
                    area[x1][y1] = oneShip;
                    area[x2][y2] = oneShip;
                    area[x3][y3] = oneShip;
                    area[x4][y4] = oneShip;
        }
        for (int i=1; i<11; i++){
            for (int j=1; j<11; j++){
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
    }

}
