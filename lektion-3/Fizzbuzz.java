public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } 
        }
    }





        // for (int i = 0; i < 100; i++) {
        //     String s = "";

        //     if (i%3 == 0) s += "Fizz";
        //     if (i%5 == 0) s += "Buzz";
        //     if (i%7 == 0) s += "Rizz";

        //     System.out.println(s == "" ? i : s);
        // }
}
