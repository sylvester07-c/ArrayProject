package dev.lpa;

import java.util.Scanner;

public class Main {


    public class MinimumElement {
        // write code here
        private static int readIntegers() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a group of numbers seperated by a comma:");
            String input = scanner.nextLine();
            int value = Integer.parseInt(input);

            return value;
        }

        private static int[] readElements(int value) {
            value = readIntegers();
            int count = 0;


                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter " + value + "number of integers: ");
                String numbers = scanner.nextLine();

                String[] splits = numbers.split(",");
                int[] values = new int[splits.length];
                for(int i = 0; i < splits.length; i++) {
                    values[i] = Integer.parseInt(splits[i].trim());
                }
                count++;

            return values;
        }

        private static int findMin(int[] arr) {
            int min = arr[0];
            for(int i = 0; i < arr.length; i++) {
                if(i < min) {
                    min = i;
                }
            }

            return min;
        }
    }

    public static void main(String[] args) {

    }
}