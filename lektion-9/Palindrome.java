public class Palindrome {

    public static boolean isPalindrome(int[] array){
        //Basfallet listor som [] eller [X] är palindrom 
        if (array.length <= 1) {
            return true;
        } 
        //Annars om första och sista talet är lika [X,... , X]
        else if (array[array.length-1] == array[0]){
            int [] newArray = new int[array.length - 2];

            for (int i = 0; i < newArray.length; i++) { 
                newArray[i] = array[i + 1];
            }
        
            //kalla isPalindrome för en mindre lista [X, Y, ..., Y, X] -> [Y, ..., Y]
            return isPalindrome(newArray);
        }
        //Annars returna false
        return false;
    }

    public static boolean isPalindrome2(int[] array){
        return(isPalindromeHelp(array, 0, array.length-1));
    }

    public static boolean isPalindromeHelp(int[] array, int left, int right){
        if (left >= right) {
            return true;
        } else if (array[left] == array[right]){
            return isPalindromeHelp(array, left + 1, right - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] palindrome = {1, 2, 3, 3, 2, 1};
        
        System.out.println(isPalindrome2(palindrome));
    }
}