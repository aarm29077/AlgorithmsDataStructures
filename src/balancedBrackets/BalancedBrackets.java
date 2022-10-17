package balancedBrackets;

import java.util.ArrayDeque;
import java.util.Deque;


public class BalancedBrackets {

    static boolean areBracketsBalanced(String expr) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            char deleted;
            switch (x) {
                case '}':
                    deleted = stack.pop();
                    if (deleted == '[' || deleted == '(') {
                        return false;
                    }
                    break;
                case ']':
                    deleted = stack.pop();
                    if (deleted == '(' || deleted == '{')
                        return false;
                    break;
                case ')':
                    deleted = stack.pop();
                    if (deleted == '{' || deleted == '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());


    }

    public static void main(String[] args) {
        String expr = "(([[{}]([]{}[]())]))";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

}