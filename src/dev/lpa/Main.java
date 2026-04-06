package dev.lpa;

import java.util.Scanner;

public class Main {



        public static int readIntegers() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of elements you wish to enter? ");
            String input = scanner.nextLine();
            int value = Integer.parseInt(input);

            return value;
        }

        public static int[] readElements(int value) {

                Scanner scanner = new Scanner(System.in);
                int count = 0;
                int[] values = new int[value];
                while(count < value) {
                    System.out.println("Enter " + value + " number of integers: ");
                    String numbers = scanner.nextLine();

                    String[] splits = numbers.split(",");
                     values = new int[splits.length];
                    for (int i = 0; i < splits.length; i++) {
                        values[i] = Integer.parseInt(splits[i].trim());
                    }
                    count++;
                }

                    return values;

        }

        public static int findMin(int[] arr) {
            int min = arr[0];
            for(int i = 0; i < arr.length; i++) {
                if(i < min) {
                    min = i;
                }
            }

            return min;
        }


    public static void main(String[] args) {
            int value = readIntegers();

            System.out.println(readElements(value));


    }
}