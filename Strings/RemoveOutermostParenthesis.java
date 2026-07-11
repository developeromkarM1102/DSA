package Strings;

public class RemoveOutermostParenthesis {

    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();

        int level = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (level > 0)
                    result.append(ch);
                level++;
            } else if (ch == ')') {
                // Decrease the nesting level for ')'
                level--;
                // If we're inside a primitive, add ')' to result
                if (level > 0)
                    result.append(ch);
            }
        }

        return result.toString();
    }
}
