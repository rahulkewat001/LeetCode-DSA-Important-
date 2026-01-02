package String;

public class GoalParserInterpretation {
    public static String interpret(String command) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G') {
                res.append("G");
            } else if (command.charAt(i) == '(') {
                if(command.charAt(i+1) == ')') {
                    res.append("o");
                    i++;
                } else {
                    res.append("al");
                    i += 2;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
}
