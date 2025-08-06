public class VariableShadowing {

    private static int number = 5;

    private static void setNumberToTen(){
        int number = 10;
    }
    
    public static void main(String[] args) {
        setNumberToTen();
        System.out.println(number);
    }
}
