package dev.lpa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] randomArray(int len) {
        Random random = new Random();
        int[] numbers = new int[len];
        for(int i = 0; i < len; i++) {
            numbers[i] = random.nextInt(100);

        }
        return  numbers;
    }

    public static int[] sortedIntegers(int[] randomNumbers) {
        int[] sortedArrays = Arrays.copyOf(randomNumbers, randomNumbers.length);


        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0; i < sortedArrays.length - 1; i++){
                if(sortedArrays[i] < sortedArrays[i + 1]){

                    temp = sortedArrays[i];

                sortedArrays[i + 1] = temp;                          }                    sortedArrays[i] = sortedArrays[i + 1];
                flag = true;
            }
        }
        return  sortedArrays;
    }

    public class SortedArray {

        public static int[] getIntegers(int capacity) {

            Scanner scanner = new Scanner(System.in);
            int[] array = new int[capacity];
            System.out.println("Enter " + capacity + " integer values:\r");
            for (int i=0; i<array.length; i++) {
                array[i] = scanner.nextInt();
            }
            return array;
        }

        public static void printArray(int[] array) {

            for (int i=0; i<array.length; i++) {
                System.out.println("Element " + i + " contents " + array[i]);
            }
        }

        public static int[] sortIntegers(int[] array) {

            int[] sortedArray = Arrays.copyOf(array, array.length);
            boolean flag = true;
            int temp;
            while (flag) {
                flag = false;
                for (int i=0; i<sortedArray.length-1; i++) {
                    if (sortedArray[i] < sortedArray[i+1]) {
                        temp = sortedArray[i];                     // 1
                        sortedArray[i] = sortedArray[i+1];         // 2
                        sortedArray[i+1] = temp;                   // 3
                        flag = true;                               // 4
                    }
                }
            }
            return sortedArray;
        }
    }

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(numbers));
//        int[] randomNumbers = randomArray(10);
//        Arrays.sort(randomNumbers);
//        System.out.println(Arrays.toString(randomNumbers));
//        int[] sorted = sortedIntegers(randomNumbers);
//        System.out.println(Arrays.toString(sorted));

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
//        System.out.println(num);
//        for(int element : num) {
//                System.out.print(element + " ");
//        }
    }
}