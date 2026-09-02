import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    static public int function (List<Integer> list) {
        List<Integer> oddNumbers = getOddNumbers(list);
        int average = getAverage(oddNumbers);
        List<Integer> normalizedNumbers = subtractFromAllElements(oddNumbers, average);
        
        return numberOfNegativeNumbers(normalizedNumbers);

    }
    
    static public List<Integer> getOddNumbers (List<Integer> list) {
        List<Integer> oddNumbers = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                oddNumbers.add(list.get(i));
            }
        }
        return oddNumbers;
    }

    static public int getAverage(List<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        int average = sum / list.size();
        return average;
    }

    static public List<Integer> subtractFromAllElements (List<Integer> list, int term) {
        List<Integer> resultList = new LinkedList<>();
        for (int number : list) {
            resultList.add(number - term);
        }
        return resultList;
    }

    static public int numberOfNegativeNumbers (List<Integer> list) {
        int count = 0;
        for (Integer integer : list) {
            if (integer < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        List<Integer> list1 = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5); 

        System.out.println(function(list1));
    }

}
