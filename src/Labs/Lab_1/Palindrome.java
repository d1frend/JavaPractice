package Labs.Lab_1;

public class Palindrome {

    public static void main(String[] args){
        //String[] str = {"madam", "racecar",  "apple",  "kayak",  "song",  "noon"};
        for(int i = 0; i <args.length; i++){
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }

    public static String reverseString(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++){
            str = s.charAt(i) + str;
        }
        return str;
    }

    public static boolean isPalindrome(String firstWord){
        String secondWord = reverseString(firstWord);
        return firstWord.equalsIgnoreCase(secondWord);
    }
}
