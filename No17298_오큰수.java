import java.io.*;
import java.util.*;
import java.util.Stack;

public class No17298_오큰수 {
    public static void main(String[] args) throws IOException, EmptyStackException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int tc = Integer.parseInt(br.readLine());


        String[] str = br.readLine().split(" ");


        Stack<Integer> A = new Stack<>();
        //Stack<Integer> temp = new Stack<>();
        Stack<Integer> NGE = new Stack<>();


        int t=0;

        for (int i=tc-1;i>=0;i--) {
            t=Integer.parseInt(str[i]);
           // System.out.println(t);

            if(A.isEmpty()) {
                NGE.add(-1);
                A.push(t);
            }
            else {
                while (!A.isEmpty() && t >= A.peek())
                    A.pop();

                if (!A.isEmpty()) {
                    NGE.add(A.peek());
                    A.add(t);
                }
                else {
                    NGE.add(-1);
                    A.add(t);
                }
            }

        }



        for (int i=0;i<tc;i++)
             sb.append(NGE.pop()+" ");

        System.out.println(sb.toString());


    }
}
