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
        int c = 1;
        for (int j = 0; j < num; j++) {
            masLeg[j] = c++;
        }
        System.out.println(Arrays.toString(masLeg));

        return masLeg;
    }

//    public static int lenRMas(int[] mas) {
//        int rightcount = 0;
//
//        for (int i = 0; i < mas.length; i++) {
//            if (i % 2 == 0) {
//                rightcount++;
//            }
//        }
//
//        return rightcount;
//    }

    public static int divMas(int[] mas) {

        int leftcount = 0;
        int rightcount = 0;
        int rightpos = 0;
        int leftpos = 0;
        int count = 0;




        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                leftcount++;
            } else {
                rightcount++;
            }
        }

        int[] leftMas = new int[leftcount];
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                leftMas[leftpos++] = mas[i];
            }
        }

        int[] rightMas = new int[rightcount];
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                rightMas[rightpos++] = mas[i];
            }
        }

        if (mas.length < 3) return 0;
        if (mas.length == 3) return 1;


        System.out.println(Arrays.toString(rightMas));

        System.out.println(Arrays.toString(leftMas));

        divMas(leftMas);

        divMas(rightMas);



        return 1;
    }

}



