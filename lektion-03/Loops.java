public class Loops {

    public static void fizzBuzz(){
        /* 
         * Skriv ut alla tal mellan 1-100
         * Alla tal delbara på 3 ersätts med fizz
         * Alla tal delbara med 5 ersätts med buzz
         * tal delbara med båda skrivs: fizzbuzz
         * 1
         * 2
         * fizz
         * 4
         * buzz
         * fizz
         * 7
         * 8
         * fizz
         * buzz
         * 11
         * fizz
         * 13
         * 14
         * fizzbuzz
         * 16
         * ...
         */
    }

    
    /*
     * Vilka siffror kommer dessa loopar att printa?
     * De kommer se ut såhär:
     *  0 0 0 0 0 0 
     *  0 0 0 0 0 0 
     *  0 0 0 0 0 0 
     *  0 0 0 0 0 0 
     *  0 0 0 0 0 0 
     *  0 0 0 0 0 0
     */

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
    
    public static void print4(){
    /*
     *   Multiplikationstabellen:
     * 
     *   1  2  3  4  5  6 
     *   2  4  6  8 10 12 
     *   3  6  9 12 15 18 
     *   4  8 12 16 20 24 
     *   5 10 15 20 25 30
     *   6 12 18 24 30 36
     */
    }

    public static void print5(){
        /*
        *    Fallande uppräkning:
        *
        *    0  6 12 18 24 30
        *    1  7 13 19 25 31
        *    2  8 14 20 26 32
        *    3  9 15 21 27 33
        *    4 10 16 22 28 34
        *    5 11 17 23 29 35
        */
    }

  
    public static int digitalRoot(int n){
        /*
         * Returnera digitala roten av ett tal dvs:
         * ta siffersumman av ett tal om och om igen 
         * tills du får ett tal mindre än 10. Det
         * blir den digitala roten. (2 i exemplet nedan)
         * 18920
         * - > 1 + 8 + 9 + 2 + 0
         * - > 20
         * - > 2 + 0
         * - > 2
         */
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(37987));      
    }
}



















