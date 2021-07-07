import java.io.*;
import java.util.*;

public class No18258_큐2 {
    public static void main(String[] args) throws IOException{
        List<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        String s;



        for (int i=0;i<tc;i++) {
            switch (s=br.readLine()) {
                case ("front") :
                    if (!q.isEmpty())
                        bw.write(q.get(0)+"\n");
                    else
                        bw.write(-1+"\n");
                    break;

                case ("back") :
                    if (!q.isEmpty())
                        bw.write(q.get(q.size()-1)+"\n");
                    else
                        bw.write(-1+"\n");
                    break;
                case ("size") :
                    bw.write(q.size()+"\n");
                    break;
                case ("empty") :
                    if (q.isEmpty())
                        bw.write(1+"\n");
                    else
                        bw.write(0+"\n");
                    break;
                case ("pop") :
                    if (!q.isEmpty())
                        bw.write(q.remove(0)+"\n");
                    else
                        bw.write(-1+"\n");
                    break;
                default :
                    if (s.split(" ")[0].equals("push")) {
                        int x = Integer.parseInt(s.split(" ")[1]);
                        q.add(x);
                    }

            }
        }
    bw.flush();
    }
}
