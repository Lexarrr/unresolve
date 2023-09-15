import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFile = "input.txt";
        String outputFile = "Output.txt";
        Scanner sc = new Scanner(new File(inputFile));
        Writer wr = new FileWriter(outputFile);

        List<Character> validFirstChars = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] a = s.split("");
            System.out.println(Arrays.toString(a));
            if (a.length != 5 || a[2].equals("-")) {
                wr.write("Error\n");
                System.out.println("Error");
                break;
            }
            int b = Integer.parseInt(a[1]);
            int c = Integer.parseInt(a[4]);
            if (b - c != 2 && a[0].equals(a[3])) {
                wr.write("No\n");
                System.out.println("No");
            }
            if (){
                System.out.println("No");
            }
            else {
                wr.write("Yes\n");
                System.out.println("Yes");
            }
        }
        wr.close();
    }
}