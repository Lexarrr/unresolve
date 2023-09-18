import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        toCheckedStep(toScan(), toWrite());
//        toWrite().close();

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

    public static void toCheckedStep(Scanner sc, Writer wr) throws IOException {
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] masStep = s.split("");

            if (masStep.length != 5) {  //masStep[0] > 51
                wr.write("Error\n");
                System.out.println("Error");
            } else {
                int parsFirstNum = Integer.parseInt(masStep[1]);
                int parsSecNum = Integer.parseInt(masStep[4]);
                int compareLet = masStep[0].compareTo(masStep[3]);
                if (parsFirstNum - parsSecNum != 2 && compareLet == -1 || parsFirstNum - parsSecNum == 2 && compareLet != -1 || masStep[0].equals(masStep[3])) {
                    wr.write("No\n");
                    System.out.println("No");
                } else {
                    wr.write("Yes\n");
                    System.out.println("Yes");
                }
            }
        }
    }
}