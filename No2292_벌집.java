import java.io.*;

public class No2292_벌집 {

    public static void main(String[] args) throws  IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int cnt=1;
    int sum=1;

    if (x==1)
        System.out.println("1");
    else {
        while (sum<x) {
           sum+=6*cnt;
           cnt++;
           }
        System.out.println(cnt);
        }

        }
    }



