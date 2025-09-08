public class If {
    public static void main(String[] args) {
        int pin = 1235;

        if (pin == 1234){
            System.out.println("Logged in");
        } else {
            System.out.println("Du är en skurk! >:(");
        }
    }

    public int absoluteValue(int n){
        if (n > 0){
            return n;
        } else if (n < 0){
            return -n;
        } else {
            return 0;
        }
    }
}
