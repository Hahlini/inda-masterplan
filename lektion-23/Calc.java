public class Calc {

    public static int calculate(int a, char operation, int b) {
        
        if (operation == '+') {
            return a + b;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(7, '+', 3));
    }
}