package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int sum = 0;
        for (String number: numbers) {
            sum += Integer.parseInt(number);
        }
        double avg = sum/(double)numbers.length;
        System.out.printf(avg + "-->%.3f", avg);
    }
}
