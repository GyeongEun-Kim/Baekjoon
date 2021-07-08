import java.util.*;
import java.io.*;

public class No10250_ACM호텔 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i=0;i<tc;i++) {
            String temp[] = br.readLine().split(" ");
            int h = Integer.parseInt(temp[0]); //세로
            int w = Integer.parseInt(temp[1]); //가로
            int n = Integer.parseInt(temp[2]);

            Integer floor = (n % h);
            Integer num;
            if (floor==0) {
                floor = h;
                num = n/h;
            }
            else
                num = n / h +1;

            if (num<10)
                System.out.println(floor.toString()+"0"+num);
            else
                System.out.printf("%d%d\n",floor,num);
        }
    }
}
