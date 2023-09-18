import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Brakes {
    public static void main(String[] args) {

        toFindLenBrakes(toScan());

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

    public static void toFindLenBrakes(Scanner sc) {
        String a = sc.nextLine();
        String[] aMasLen = a.split("");
        String b = sc.nextLine();
        String[] bMasLen = b.split("");

        int minlen = aMasLen.length + bMasLen.length;
        for (int i = Integer.parseInt(String.valueOf(bMasLen.length));
                                                i < aMasLen.length; i++) {
            int f = i;
            int l = i + bMasLen.length - 1;
            for (int j = f; j < l; j++) {
                int av;
//                int c = 0;
//                if (j >= 0 && j<= aMasLen.length){
//                    av = aMasLen[j] - c;
//                }
            }

        }
        System.out.println(minlen);

    }

}

