import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class SolutionTest {

    @Test
    public void functionReturnsCorrectForSimpleLists() {
        List<Integer> list1 = Arrays.asList(1, 2 ,3); 
        List<Integer> list2 = Arrays.asList(1, 3, 5, 4, 7); 
        List<Integer> list3 = Arrays.asList(1, 3, 5, 7); 


        assertTrue(Solution.function(list1) == 1);
        assertTrue(Solution.function(list2) == 1);
        assertTrue(Solution.function(list3) == 2);
    }

    @Test
    public void functionReturnsCorrectForAdvancedLists() {
        List<Integer> list1 = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5); 
        List<Integer> list2 = Arrays.asList(2, 6, -20, 0, 8);         

        assertTrue(Solution.function(list1) == 3);
        assertTrue(Solution.function(list2) == 0);
    }

    @Test
    public void getOddReturnsCorrect(){
        // Hur testar vi detta
        List<Integer> list1 = Arrays.asList(); 
        List<Integer> list2 = Arrays.asList(); 
    }
    
    @Test
    public void getAverageIsCorrect(){
        // Hur testar vi detta
        List<Integer> list1 = Arrays.asList(); 
        List<Integer> list2 = Arrays.asList(); 
    }

    @Test
    public void numberOfNegativeNumbersIsCorrect () {
        // Hur testar vi detta

        List<Integer> list1 = Arrays.asList(); 
        List<Integer> list2 = Arrays.asList(); 
    }
}