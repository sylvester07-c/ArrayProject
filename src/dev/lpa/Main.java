package dev.lpa;

import javax.lang.model.util.Elements;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

        public static int readIntegers() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of elements you wish to enter? ");
            String input = scanner.nextLine();
            int value = Integer.parseInt(input);

            return value;
        }

        public static int[] getElement(int value) {
            Scanner scanner = new Scanner(System.in);
            int[] values = new int[value];
            for(int i = 0; i < values.length; i++) {
                System.out.println("Enter " + value + " Integer numbers:");
                String numbers = scanner.nextLine();
                int num = Integer.parseInt(numbers);
                values[i] = num;
            }
             return  values;

        }

        public static int findMin(int[] arr) {
            int min = arr[0];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = i;
                }
            }

            return min;
        }

        public static void reverse(int[] array) {
            int maxIndex = array.length - 1;
            int halfLength = array.length / 2;

            for(int i = 0; i < halfLength; i++) {
                int temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex - i] = temp;
            }

            System.out.println("-->" + Arrays.toString(array));
        }




    public static void main(String[] args) {
//            int value = readIntegers();
//            int[] arr = getElement(5);



//            System.out.println(Arrays.toString(arr));
//            System.out.println("Min value is: " + findMin(arr));
            int[] arrs = new int[]{1,2,3,4,5};
            System.out.println(Arrays.toString(arrs));
            reverse(arrs);

            int[][] array = new int[4][5];
            System.out.println(Arrays.deepToString(array));

            for(int i = 0; i < array.length; i++){
                var innerArray = array[i];
                for(int j = 0; j < innerArray.length; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();

            }

            for(var outer : array){
                for(var element : outer) {
                    System.out.println(element + " ");
                }
            }

    }
}