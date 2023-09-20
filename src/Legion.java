import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Legion {
    public static void main(String[] args) {

        divMas(toGetMas(toScan()));
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

    public static int[] toGetMas(Scanner sc) {
        int num = sc.nextInt();

        int[] masLeg = new int[num];
        int i = 0;
        while (sc.hasNextInt()) {
            masLeg[i++] = sc.nextInt();
        }
        System.out.println(Arrays.toString(masLeg));

        return masLeg;
    }

    public static int[] divMas(int[] mas) {
        int length = mas.length;
        if (length == 1) return mas;
        int ost = length % 3;
//        double div = (double) length / 3;
        if (ost == 0) {
            System.out.println(length / 3);
        } else {
            int divide = length / 3;
            ost = divide + ost;
            int res = length - ost;

            System.out.println("ost: " + ost);
//            System.out.println(divide);
            System.out.println("колво групп по 3: " + res / 3);
        }
        return mas;
    }

}
