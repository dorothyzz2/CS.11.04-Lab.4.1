public class Main {

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
        return "";
    }


    // 4. decipherThis
    public static String decipherThis(String input) {
        return "";
    }

}
