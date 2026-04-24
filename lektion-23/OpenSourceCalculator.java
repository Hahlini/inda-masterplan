import java.util.List;

public class OpenSourceCalculator {
    

    /**
     * @author Johan
     */
    static int add (int a, int b) {
        return a + b;
    }

    /**
     * @author Isak
     */
    static int average (List<Integer> list) {
        return list.stream().reduce(0, (a,b) -> add(a, b))/list.size();
    }

    /**
     * @author Johan
     */
    static int subtract (int a, int b) {
        return a - b;
    }

    
    /**
     * @author Isak
     */
    static int multiply(int a, int b) {
        return a * b;
    }
}
