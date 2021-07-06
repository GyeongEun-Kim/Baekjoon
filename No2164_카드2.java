
import java.util.*;
import java.io.*;

public class No2164_카드2 {
    public static void main(String[] args) throws IOException{
        Queue<Integer> queue = new LinkedList<>() ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i=1;i<=num;i++) {
            queue.add(i);
        }

        while (queue.size()!=1) {
            queue.remove();
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());


    }
}
