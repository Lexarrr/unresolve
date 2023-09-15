import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;


public class Main {
    public static void main(String[] args) throws IOException {

        String inputFile = "input.txt";
        String outputFile = "Output.txt";
        Scanner sc = new Scanner(new File(inputFile));
        Writer wr = new FileWriter(outputFile);

        while (sc.hasNextLine() && sc != null) {
            String s = sc.nextLine();
            String[] masStep = s.split("");
            System.out.println(Arrays.toString(masStep));
            if (masStep.length != 5 || masStep[0].equals(masStep[3])) {  // || masStep[2].equals("-")
                wr.write("Error\n");
                System.out.println("Error");
                break;
            }
            int b = Integer.parseInt(masStep[1]);
            int c = Integer.parseInt(masStep[4]);
            int d = masStep[0].compareTo(masStep[3]);
            System.out.println(d);
            if (b - c == 2 && d != -1 || b - c != 2 && d == -1) {
                wr.write("Yes\n");
                System.out.println("Yes");
            } else {
                wr.write("No\n");
                System.out.println("No");
            }
        }
        wr.close();
    }
}