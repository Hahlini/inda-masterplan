import java.util.Random;

public class DNDDice {
    static Random random = new Random();

    // Method that calculates the roll of any number of dice
    public int rollDice(int amount, int sides) {
        int sum = 0;

        for (int i = 0; i < amount; i++) {
            sum += random.nextInt(sides) + 1;
        }
        return sum;
    }

    // Overload of rollDice that takes a String argument and parses the
    // corresponding values in rollDice()
    public int rollDice(String dice) {
        String[] split = dice.split("d");
        return rollDice(Integer.valueOf(split[0]), Integer.valueOf(split[1]));
    }

    public int evaluateExpression(String expression) {
        String[] split = expression.split("\\+");
        int sum = 0;

        // For every piece of the expression separated by a "+" either roll a dice or add
        // the number
        for (int i = 0; i < split.length; i++) {
            // Check of the piece is a dice or a number by checking for a "d"
            if (split[i].contains("d")) {
                sum += rollDice(split[i]);
            } else {
                sum += Integer.valueOf(split[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        DNDDice dnddice = new DNDDice();

        // Iterate through the command line arguments and evaluate each expression.
        for (int i = 0; i < args.length; i++) {
            System.out.println(dnddice.evaluateExpression(args[i]));
        }
    }
}