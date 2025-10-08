import java.util.ArrayList;
import java.util.Random;

public class BattleGame {
    public static void main(String[] args) {
        
        ArrayList<Indamon> indamons = new ArrayList<>();
        
        indamons.add(new Indamon("Isak", 20, 30, 4));
        indamons.add(new Indamon("Johan", 20, 40, 3));
        indamons.add(new Indamon("Glassey", 25, 24, 5));
        
        boolean gameOver = false;
        Random randomGenerator = new Random();
        while(!gameOver) {
            int attackerIndex = randomGenerator.nextInt(indamons.size());
            int victimIndex = randomGenerator.nextInt(indamons.size());
        
            Indamon attacker = indamons.get(attackerIndex);
            Indamon victim = indamons.get(victimIndex);
        
            attacker.attack(victim); // This sets fainted = true, if hp becomes < 0
            if (victim.isFainted()) {
                indamons.remove(victim);
                System.out.printf("The indamon %s fainted!\n\n", victim.getName());
        
                if (indamons.size() == 1) {
                    gameOver = true;
                }
            }
        }
        
        Indamon winner = indamons.get(0);
        
        System.out.printf("The indamon %s has won the game!\n\n", winner.getName());
    }
}









