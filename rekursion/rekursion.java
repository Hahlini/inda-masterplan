public class rekursion {

    public static int fakultet(int n){
        //basfall
        if(n <= 1){
            return 1;
        }
        //rekursionssteg.
        return n * fakultet(n - 1);
    }

    public static int fibb(int n){
        if(n <= 2){
            return 1;
        }
        return fibb(n - 1) + fibb(n - 2);
    }

    public static void main(String[] args) {
        //implementera fibbonacci med rekursion: (1,1,2,3,5,8,13...)
        System.out.println(fibb(5));
    }
}