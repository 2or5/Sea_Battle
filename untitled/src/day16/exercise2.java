package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1");
        PrintWriter pw = new PrintWriter(file1);
        Random random = new Random();
        int[] array = new int[100];
        for (int i =0; i<array.length; i++){
            array[i] = random.nextInt(100);
            pw.println(array[i]);
        }
        pw.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2");
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()){
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20){
                pw2.println(sum/20.0);

                counter = 0;
                sum = 0;
            }
        }
        pw2.close();

        Scanner scannerResult = new Scanner(file2);

        double resultLast = 0;
        while (scannerResult.hasNextLine()){
            resultLast += Double.parseDouble(scannerResult.nextLine());

            System.out.println(resultLast);
        }
    }
}
