package String;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
            } else if(count > 0) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
