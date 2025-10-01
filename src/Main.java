import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(parenthesesCheck("()"));
        System.out.println(parenthesesCheck(")(()))"));
        System.out.println(parenthesesCheck("("));
        System.out.println(parenthesesCheck("(())((()())())"));
        System.out.println(reverseInteger(1234));
        System.out.println(reverseInteger(2468));
        System.out.println(encryptThis("Hello good day"));
        System.out.println(encryptThis("Ready set go"));
        System.out.println(decipherThis("72olle 103doo 100ya"));
        System.out.println(decipherThis("82yade 115te 103o"));
    }

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        int openCount = 0;
        int closedCount = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                openCount ++;
            }
            if (s.charAt(i) == ')'){
                closedCount ++;
            }
            if (closedCount > openCount){
                return false;
            }
        }   
        return (openCount == closedCount);
    }

    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String number = String.valueOf(n);
        String reverse = "";
        for (int i = number.length() - 1; i >= 0; i--){
            reverse += number.charAt(i);
        }
        return reverse; 
    }


    // 3. encryptThis
    public static String encryptThis(String input) {
        String text = "";
        Scanner x = new Scanner(input);
        while (x.hasNext()) {
            String word = x.next();
            char first = word.charAt(0);

            if (word.length() > 2) {
                char second = word.charAt(1), last = word.charAt(word.length() - 1);
                word = "" + first + last + word.substring(2, word.length()-1) + second;
            }
            text += " " + (int) first + word.substring(1);
        }
        if (text.length() > 0)
            return text.substring(1);
        else
            return text;
    }


    // 4. decipherThis
    public static String decipherThis(String input) {
        String txt = "";
        Scanner y = new Scanner(input);
        while (y.hasNext()) {
            String word = y.next();
            int intBack;
            for (intBack=0; intBack < word.length(); intBack++)
                if ('0' > word.charAt(intBack) || word.charAt(intBack) > '9')
                    break;
            int front = Integer.parseInt(word.substring(0, intBack));
            String otherWord = word.substring(intBack);
            txt += " " + (char) front;
            if (otherWord.length() == 1)
               txt += otherWord;
            else
               txt += "" + otherWord.charAt(otherWord.length()-1) + otherWord.substring(1, otherWord.length()-1) + otherWord.charAt(0);
        }
        if (txt.length() > 0)
            return txt.substring(1);
        else
            return txt;
    }

}
