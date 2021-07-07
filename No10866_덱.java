import java.util.*;
import java.io.*;

public class No10866_덱 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());

        Deque<Integer> deq = new LinkedList<>();

        for (int i=0;i<tc;i++) {
            String str = br.readLine();
            int x=0;
            if (str.contains(" ")) {
                x = Integer.parseInt(str.split(" ")[1]);
                str = str.split(" ")[0];
            }

            switch (str) {
                case ("push_front") :
                    deq.addFirst(x);
                    break;
                case ("push_back") :
                    deq.addLast(x);
                    break;
                case ("pop_front") :
                    if (!deq.isEmpty())
                        bw.write(deq.pollFirst()+"\n");
                    else
                        bw.write(-1+"\n");
                    break;
                case ("pop_back") :
                    if (!deq.isEmpty())
                        bw.write(deq.pollLast()+"\n");
                    else
                        bw.write(-1+"\n");
                    break;
                case ("size") :
                    bw.write(deq.size()+"\n");
                    break;
                case ("empty") :
                    if (deq.isEmpty())
                        bw.write(1+"\n");
                    else
                        bw.write(0+"\n");
                    break;
                case ("front") :
                    if (!deq.isEmpty())
                        bw.write(deq.getFirst()+"\n");
                    else
                        bw.write(-1+"\n");
                    break;
                case ("back") :
                    if (!deq.isEmpty())
                        bw.write(deq.getLast()+"\n");
                    else
                        bw.write(-1+"\n");
                    break;
            }
        }
    bw.flush();
    }
}
