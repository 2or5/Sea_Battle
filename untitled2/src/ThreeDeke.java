import java.io.IOException;

public class ThreeDeke implements Ships {
    @Override
    public void arena() {
    }

    @Override
    public void fillShips() throws IOException {
        System.out.println("Введіть 3-х палубний корабль (формат: x,y;x,y;x,y)");
        String line = scanner.nextLine();
        if (line.length() != 11) {
            System.out.println("Тобі потрібно ввести 3-х палубний корабль");
        }
        int[] rowIndex = new int[50];
        int[] colIndex = new int[50];
        int index = 0;
        fillBlueCells(rowIndex, colIndex, index);
        String[] coordinates = line.split("[,;]");
        for (int i = 1; i < 11; i++) {
            int x1 = Integer.parseInt(coordinates[0]);
            int y1 = Integer.parseInt(coordinates[1]);
            int x2 = Integer.parseInt(coordinates[2]);
            int y2 = Integer.parseInt(coordinates[3]);
            int x3 = Integer.parseInt(coordinates[4]);
            int y3 = Integer.parseInt(coordinates[5]);
            if (rowIndex[i] == x1 && colIndex[i] == y1 ||
            rowIndex[i] == x2 && colIndex[i] == y2 ||
            rowIndex[i] == x3 && colIndex[i] == y3){
                System.out.println("На цій координаті в тебе вже стоїть корабль");
                throw new IOException();
            }
            if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3)) {
                System.out.println("Помилка! Введено дві однакові координати.");
                throw new IOException();
            }
              area[x1][y1] = oneShip;
              area[x2][y2] = oneShip;
              area[x3][y3] = oneShip;
           }
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillBlueCells(int[] rowIndex, int[] colIndex, int index) {
        for (int i=1; i<11; i++){
            for (int j=1; j<11; j++){
                if (area[i][j] == oneShip){
                    if (i>0 && area[i-1][j] != oneShip){
                        area[i-1][j] = blueCell;
                    }
                    if (i < area.length-1 && area[i+1][j] != oneShip){
                    area[i+1][j] = blueCell;
                   }
                    if (j < area.length-1 && area[i][j+1] != oneShip){
                        area [i][j+1] = blueCell;
                        area [i+1][j+1] = blueCell;
                        area [i-1][j+1] = blueCell;
                    }
                    if (j>0 && area[i][j-1] != oneShip ){
                        area [i][j-1] = blueCell;
                        area [i+1][j-1] = blueCell;
                        area [i-1][j-1] = blueCell;
                    }
                }
                if(area[i][j] == oneShip || area[i][j] == blueCell){
                    rowIndex[index] = i;
                    colIndex[index] = j;
                    index++;
                }
            }
        }
    }
}