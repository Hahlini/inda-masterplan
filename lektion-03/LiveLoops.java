public class LiveLoops {

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {

    }
}



        // Indamon johan = new Indamon("Jojomon", 20, 20, 2);
        // Indamon csn = new Indamon("Studieskuldachu", 25 , 10, 5);

        // while (!csn.isFainted() && !johan.isFainted()) {
        //     johan.attack(csn);
        //     sleep(2);

        //     csn.attack(johan);
        //     sleep(2);
        // }

        // if (johan.isFainted()) {
        //     System.out.println(johan.getName() + " fainted and lost the match");
        // } if (csn.isFainted()) {
        //     System.out.println(csn.getName() + " fainted and lost the match");
        // }






