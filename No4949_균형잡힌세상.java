import java.util.*;
import java.util.Stack;
import java.io.*;

public class No4949_균형잡힌세상 {
    public static void main(String[] args) throws IOException{
        Stack<Character> stack =new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp;

        while (!(temp= br.readLine()).equals(".")) {

            stack.clear();
            String result = "yes";

            char[] charArr = temp.toCharArray();

            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '(' || charArr[i]=='[') // 소괄호
                    stack.push(charArr[i]);
                else if (charArr[i] == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        result="no";
                        break;
                    }
                }
                else if (charArr[i] == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    else {
                        result="no";
                        break;
                    }
                }
            }

            if (!stack.isEmpty())
                result="no";

            System.out.println(result);
        }
    }
}
