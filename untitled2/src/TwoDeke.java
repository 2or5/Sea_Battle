import java.io.IOException;

public class TwoDeke implements Ships{
    @Override
    public void arena() {
    }

    @Override
    public void fillShips() throws IOException {
        System.out.println("Введіть 2-х палубний корабль (формат: x,y;x,y)");
        String line = scanner.nextLine();
        if (line.length() != 7) {
            System.out.println("Тобі потрібно ввести 2-х палубний корабль");
        }
        int[] rowIndex = new int[100];
        int[] colIndex = new int[100];
        int index = 0;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (area[i][j] == oneShip) {
                    if (i > 0 && area[i - 1][j] != oneShip) {
                        area[i - 1][j] = blueCell;
                    }
                    if (i < area.length - 1 && area[i + 1][j] != oneShip) {
                        area[i + 1][j] = blueCell;
                    }
                    if (j < area.length - 1 && area[i][j + 1] != oneShip) {
                        area[i][j + 1] = blueCell;
                        area[i + 1][j + 1] = blueCell;
                        area[i - 1][j + 1] = blueCell;
                    }
                    if (j > 0 && area[i][j - 1] != oneShip) {
                        area[i][j - 1] = blueCell;
                        area[i + 1][j - 1] = blueCell;
                        area[i - 1][j - 1] = blueCell;
                    }
                }
                if (area[i][j] == oneShip || area[i][j] == blueCell) {
                    rowIndex[index] = i;
                    colIndex[index] = j;
                    index++;
                }
            }
        }
            String[] coordinates = line.split("[,;]");
            for (int i = 1; i < 11; i++) {
                int x1 = Integer.parseInt(coordinates[0]);
                int y1 = Integer.parseInt(coordinates[1]);
                int x2 = Integer.parseInt(coordinates[2]);
                int y2 = Integer.parseInt(coordinates[3]);
                if (rowIndex[i] == x1 && colIndex[i] == y1 || rowIndex[i]==x2 && colIndex[i] == y2){
                    System.out.println("На цій координаті в тебе вже стоїть корабль");
                    throw new IOException();
                }
                if (x1 == x2 && y1 == y2) {
                    System.out.println("Помилка! Введено дві однакові координати.");
                    throw new IOException();
                }
                area[x1][y1] = oneShip;
                area[x2][y2] = oneShip;
                for (int j = 1; j < 11; j++) {
                    System.out.print(area[i][j]);
                }
                System.out.println();
            }
    }

}


