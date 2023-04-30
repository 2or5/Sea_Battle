import java.util.Scanner;

public class Course extends OneDeke{
      public  String [][] area2 = new String[12][12];
    private static final String blueCell2 = "\uD83D\uDFE6";
    private static final String redCell = "\uD83D\uDFE5";
    public void emptyArea(){
        for (int i = 1; i<11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(area2[i][j] = cell);
            }
            System.out.println();
        }
    }
    public void shoots(String[][] area){


        Scanner scanner1 = new Scanner(System.in);
        String line1 = scanner1.nextLine();
        String[] coordinates1 = line1.split(",");
        int x1 = Integer.parseInt(coordinates1[0]);
        int y1 = Integer.parseInt(coordinates1[1]);
      if (area[x1][y1].equals(cell)){
            area2 [x1][y1] =blueCell2;
            System.out.println("Mimo");
        }else if (area[x1][y1] == oneShip){
          area2[x1][y1] = redCell;
          if (area[x1-1][y1] != blueCell || area[x1+1][y1] != blueCell
          || area[x1][y1-1] != blueCell || area[x1][y1+1] != blueCell){
              System.out.println("Kill");
          }else {
              System.out.println("Bingo");
          }
        }else if (area[x1][y1] == blueCell){
          area2[x1][y1] = blueCell2;
          System.out.println("Mimo");
      }
        for (int i=1; i<11; i++){
            for (int j=1;j<11;j++){
                System.out.print(area2[i][j]);
            }
            System.out.println();
        }
    }
    public static void shoots2 (String a){
        System.out.println(a);
    }
}
