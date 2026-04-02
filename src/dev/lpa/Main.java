package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] randomArray(int len) {
        Random random = new Random();
        int[] numbers = new int[len];
        for(int i = 0; i < len; i++) {
            numbers[i] = random.nextInt(100);

        }
        return  numbers;
    }



    public static void main(String[] args) {

        int[] numbers = randomArray(10);
        Arrays.sort(numbers);

//        int[] arrays = randomNumberArray(10);
//        System.out.println(Arrays.toString(arrays));

//        int[] integerArray = new int[10];
//        integerArray[5] = 50;
//
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[3] = 4.5;

//        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] num = {2, 3, 4, 5, 6, 7, 8, 10};
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }
////        System.out.println(num);
//        for(int element : num) {
//                System.out.print(element + " ");
//        }
    }
}