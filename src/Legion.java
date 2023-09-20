import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Legion {
    public static void main(String[] args) {

//        divMas(toGetMas(toScan()));
        toGetMas(toScan());
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
        int c = 1;
        for (int j = 0; j < num; j++) {
            masLeg[j] = c++;
        }
        System.out.println(Arrays.toString(masLeg));

        return masLeg;
    }

    public static int[] divMas(int[] mas) {
        int length = mas.length;
        if (length == 3) return mas;
        int divide = length / 2;
        int[] rightMas = new int[length];
        int[] leftMas = new int[length - divide];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0){
                for (int j = 0; j < divide; j++) {
                    rightMas[j] = mas[i];
                    System.out.println(Arrays.toString(rightMas));
                }

            }
//
//            for (int s = 0; s < divide; s++) leftMas[s] = mas[s];
//            for (int s = 0; s < length - divide; s++)
//                rightMas[s] = mas[s + divide];
        }




        return rightMas;
    }

}
