public class Loops {

    public void fizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            String string = "";
            if (i % 3 == 0) string += "Fizz";
            if (i % 5 == 0) string += "Buzz";
            if (i % 7 == 0) string += "Suzz";
            if (string == "") string += i;
            System.out.println(string);   
        }
    }

    public static void print1(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" 1 "); 
            }
            System.out.println();
        }
    }

    public static void print2(){
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" 1 "); 
            }
            System.out.println();
        }
    }

    public static void print3(){
        for (int i = 0; i < 6; i ++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(" " + (6 * i + j) + " "); 
            }
            System.out.println();
        }
    }

    public static int sifferSumma(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        } 
        return sum;
    }
   
    public static int digitalRoot(int n){
        while (n >= 10) {
            n = sifferSumma(n);
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(digitalRoot(37987123));      
    }
}



















