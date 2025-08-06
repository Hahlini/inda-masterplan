import java.util.ArrayList;

public class PassByValue {

    public static void addFive(int number){
        number += 5;
    }

    public static void addFive(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 5;
        }
    }

    public static void addFive(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 5);
        }
    }    

    public static void main(String[] args) {
        
        int number = 10;
        int[] numberArray = {1, 2, 3, 4 ,5};
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numberList.add(i);
        }

        System.out.println(number);
        printArray(numberArray);
        System.out.println(numberList);

        addFive(number);
        addFive(numberArray);
        addFive(numberList);

        System.out.println();

        System.out.println(number);
        printArray(numberArray);
        System.out.println(numberList);

    }

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.printf("%-3d", i);
        }
        System.out.println();
    }
}
