package dev.lpa;

public class Main {
    public static void main(String[] args) {

        int[] integerArray = new int[10];
        integerArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[3] = 4.5;

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num = {2, 3, 4, 5, 6, 7, 8, 10};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
//        System.out.println(num);
        for(int element : num) {
                System.out.print(element + " ");
        }
    }
}