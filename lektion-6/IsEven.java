public class IsEven {
    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        IsEven checker = new IsEven();
        for (String string : args) {
            int number = Integer.parseInt(string);
            System.out.printf("%d is %s\n", number, checker.isEven(number) ? "even" : "odd");    
        }

        // om vi vill köra java IsEven 2+7?
        // String.split()
    }
}



// for (String string : args) {
//     String[] split = string.split("\\+");
//     int sum = 0;
//     for (String numberString : split) {
//         int number = Integer.parseInt(numberString);
//         sum += number;
//     }
    
//     System.out.printf("%d is %s\n", sum, checker.isEven(sum) ? "even" : "odd");    
// }


