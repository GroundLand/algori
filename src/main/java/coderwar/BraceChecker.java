package coderwar;

import java.util.Stack;

/**
 * @author cl
 * @version $Id: BraceChecker v 0.1 2019-02-22 09:26 cl Exp $$
 */
public class BraceChecker {
    public boolean isValid(String braces) {
        // Add code here

        Stack<Character> stack = new Stack<>();
        char[] chars = braces.toCharArray();
        for (char c:chars){
            if ('('==c||'{'==c||'['==c){
                stack.push(c);
            }
            if (stack.empty()){
                return false;
            }
            if (')'==c && '(' !=stack.pop()){
                return false;
            }
            if ('}'==c && '{' !=stack.pop()){
                return false;
            }
            if (']'==c && '[' !=stack.pop()){
                return false;
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }
}
