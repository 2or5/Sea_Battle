import java.io.IOException;

public class OneDeke implements Ships{

    @Override
    public void arena() {
    }
    @Override
    public void fillShips() throws IOException {
        System.out.println("Введіть 1-но палубний корабль (формат: x,y)");
        String line = scanner.nextLine();
        if (line.length() != 3) {
            System.out.println("Тобі потрібно ввести 1-но палубний корабль");
        }
        int[] rowIndex = new int[100];
        int[] colIndex = new int[100];
        int index = 0;
        for (int i=1; i<11; i++){
            for (int j=1; j<11; j++){
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
                if(area[i][j] == oneShip || area[i][j] == blueCell){
                  rowIndex[index] = i;
                  colIndex[index] = j;
                  index++;
                }
            }
        }
        String[] coordinates = line.split("[,;]");
        for (int i = 1; i  < 11; i++) {
            int x1 = Integer.parseInt(coordinates[0]);
            int y1 = Integer.parseInt(coordinates[1]);
            if (rowIndex[i] == x1 && colIndex[i] == y1){
                System.out.println("На цій координаті в тебе вже стоїть корабль");
                throw new IOException();
            }
            area[x1][y1] = oneShip;
            for (int j = 1; j < 11; j++) {
                System.out.print(area[i][j]);
            }
                System.out.println();
        }
    }
}
