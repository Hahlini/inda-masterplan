import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Refactor {
    static public int function (List<Integer> list) {
        List<Integer> oddNumbers = getOddNumbers(list);

        int sum = 0;
        for (Integer integer : oddNumbers) {
            sum += integer;
        }
        int average = sum / oddNumbers.size();

        List<Integer> normalizedNumbers = new LinkedList<>();
        for (int i = 0; i < oddNumbers.size(); i++) {
            normalizedNumbers.add(oddNumbers.get(i) - average);
        }

        int count = 0;
        for (Integer integer : normalizedNumbers) {
            if (integer < 0) {
                count++;
            }
        }

        return count;
    }

    static public List<Integer> getOddNumbers(List<Integer> list) {
        List<Integer> oddNumbers = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                oddNumbers.add(list.get(i));
            }
        }

        return oddNumbers;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 5, 7));
        System.out.println(function(list));

    }
}
