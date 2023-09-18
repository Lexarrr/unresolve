import java.io.*;
import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) throws IOException {

        toVat(toScan(), toWrite());

    }

    public static Scanner toScan() {
        String inputFile = "input.txt";
        Scanner sc;
        try {
            sc = new Scanner(new File(inputFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return sc;
    }

    public static Writer toWrite() {
        String outputFile = "Output.txt";
        Writer wr;
        try {
            wr = new FileWriter(outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wr;
    }

    public static void toVat(Scanner sc, Writer wr) throws IOException {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int w = sc.nextInt();

        int count = 0;

        if (x + y <= w) {
            count++;
        }
        if (y+z <= w){
            count++;
        }
        if (x+z <= w){
            count++;
        }
        wr.write(count);
        wr.close();
        System.out.println(count);

    }

}

