import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;


public class SolutionTest {

    @Test
    public void functionReturnsCorrectForSimpleLists() {
        List<Integer> list1 = Arrays.asList(1, 2 ,3); 
        List<Integer> list2 = Arrays.asList(1, 3, 5, 4, 6); 
        List<Integer> list3 = Arrays.asList(1, 3, 5, 7); 

        assertEquals(1, Solution.function(list1));
        assertEquals(1, Solution.function(list2));
        assertEquals(2, Solution.function(list3));
    }

    @Test
    public void functionReturnsCorrectForAdvancedLists() {
        List<Integer> list1 = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5); 
        List<Integer> list2 = Arrays.asList(2, 6, -20, 0, 8);         
        
        assertEquals(3, Solution.function(list1));
        assertEquals(0, Solution.function(list2));

    }

    @Test
    public void getOddReturnsCorrect(){
        // Hur testar vi detta
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5); 
        List<Integer> list2 = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5); 

        List<Integer> list1Odd = Solution.getOddNumbers(list1);
        List<Integer> list2Odd = Solution.getOddNumbers(list2);

        for (int i = 1; i <= 5; i += 2){
            assertTrue(list1Odd.contains(i));
            assertTrue(list2Odd.contains(i));
            assertTrue(list2Odd.contains(-i));
        }
    }
    
    @Test
    public void getAverageIsCorrect(){
        // Hur testar vi detta
        List<Integer> list1 = Arrays.asList(-2, 3, 0, 12, 2); 
        List<Integer> list2 = Arrays.asList(); 

        assertEquals(3, Solution.getAverage(list1));
        assertEquals(0, Solution.getAverage(list2));

    }

    @Test
    public void numberOfNegativeNumbersIsCorrect () {
        // Hur testar vi detta

        List<Integer> list1 = Arrays.asList(); 
        List<Integer> list2 = Arrays.asList(); 
    }
}