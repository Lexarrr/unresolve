import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Legion {
    public static void main(String[] args) {

//        divMas(toGetMas(toScan()));
//        toGetMas(toScan());
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
        int rightpos = 0;
        int leftpos = 0;
        int rightcount = 0;
        int leftcount = 0;

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                rightcount++;
            } else {
                leftcount++;
            }
        }
        int[] rightMas = new int[rightcount];
        int[] leftMas = new int[leftcount];

        while (rightMas.length != 3 || leftMas.length != 3) {
            for (int i = 0; i < mas.length; i++) {
                if (i % 2 == 0) {
                    rightMas[rightpos] = mas[i];
                    rightpos++;
                } else {
                    leftMas[leftpos] = mas[i];
                    leftpos++;
                }
            }
        }

//        while (rightMas.length != 3 || leftMas.length != 3){
//            for (int i = 0; i < rightMas.length; i++) {
//                if (i % 2 == 0) {
//                    rightMas[rightpos] = mas[i];
//                    rightpos++;
//                } else {
//                    leftMas[leftpos] = mas[i];
//                    leftpos++;
//                }
//
//            }
//            for (int i = 0; i < leftMas.length; i++) {
//                if (i % 2 == 0) {
//                    rightMas[rightpos] = mas[i];
//                    rightpos++;
//                } else {
//                    leftMas[leftpos] = mas[i];
//                    leftpos++;
//                }
//
//            }
//        }

        System.out.println(Arrays.toString(rightMas));
        System.out.println(Arrays.toString(leftMas));
        return rightMas;

    }

}

