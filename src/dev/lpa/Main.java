package dev.lpa;

import javax.lang.model.util.Elements;
import java.util.*;

public class Main {

    private static  Scanner scanner = new Scanner(System.in);


    record  GroceryItem(String name, String type, int count) {
        public GroceryItem(String name) {
            this(name, "diary", 6);

        }

    }

    public static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for(String i : items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }


    public static void removeItem(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for(String i : items) {
            String trimmed = i.trim();

            if(groceries.contains(trimmed)){
                groceries.remove(trimmed);

            }else  {
                System.out.println("Item not contained in list!");
            }
        }

    }

    public static  void printActions() {
        String textBlock = """
                Available actions:
                0 - to shutdown
                
                1 - to add item(s) to list(comma delimited list)
                
                2 - to remove item (comma delimited list)
                
                Enter a number for which action you want to take:""";
        System.out.println(textBlock + " ");
    }

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

        GroceryItem[] groceryItems = new GroceryItem[3];

        groceryItems[0] = new GroceryItem("milk");
        groceryItems[1] = new GroceryItem("apples", "produce", 6);
        groceryItems[2] = new GroceryItem("oranges", "produce", 5);

        System.out.println(Arrays.toString(groceryItems));


        ArrayList<GroceryItem> objectList = new ArrayList<GroceryItem>();
        objectList.add(new GroceryItem("Butter"));
        objectList.add(new GroceryItem("Yogurt", "produce", 7));
        objectList.add(new GroceryItem("banana"));
        System.out.println(objectList);
        objectList.remove(2);
        System.out.println(objectList);


        ArrayList<String> groceries = new ArrayList<>();

        boolean flag = true;
        while (flag) {
             printActions();
             switch(Integer.parseInt(scanner.nextLine())) {
                 case 1 -> addItems(groceries);
                 case 2 -> removeItem(groceries);
                 default -> flag = false;

             }
             groceries.sort(Comparator.naturalOrder());
             System.out.println(groceries);
        }


//
//            int[] arrs = new int[]{1,2,3,4,5};
//            System.out.println(Arrays.toString(arrs));
//            reverse(arrs);
//
//            int[][] array = new int[4][5];
//            System.out.println(Arrays.deepToString(array));
//
//            for(int i = 0; i < array.length; i++){
//                var innerArray = array[i];
//                for(int j = 0; j < innerArray.length; j++){
//                    array[i][j] = (i * 10) + (j + 1);
//                    System.out.print(array[i][j] + " ");
//                }
//                System.out.println();
//
//            }

//            for(var outer : array){
//                for(var element : outer) {
//                    System.out.println(element + " ");
//                }
//                System.out.println();
//            }

    }
}