import java.util.Random;

import javax.management.RuntimeErrorException;

public class Switch {
    public static void main(String[] args) {
        String command = args[0];

        if (command.equals("heja")) {
            System.out.println("God dag! :D");
        } else if (command.equals("räkna")){
            System.out.println("2+2=3 quik mafs");
        }else if (command.equals( "slumpa")){
            System.out.println(new Random().nextInt(20)+1);
        }else if (command.equals("krasha")){
            throw new RuntimeErrorException(null); 
        }

        switch (command) {
            default:
                System.out.println("Ditt kommando fanns inte");
                break;
            case "heja":
                System.out.println("God dag! :D");
                break;
            case "räkna":
                System.out.println("2+2=3 quik mafs");
                break;
            case "flalal":
                System.out.println("flalala");

        }
        
    }
}
