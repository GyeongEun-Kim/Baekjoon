import java.io.*;

public class No2869_달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int morning = Integer.parseInt(temp[0]);
        int night = Integer.parseInt(temp[1]);
        int height = Integer.parseInt(temp[2]);

        int days = 1;

        height = height - morning;

        if (height==0) {
            days=1;
        }
        else if (height% (morning - night) == 0)
            days += height / (morning - night);
        else
            days += height / (morning - night) +1;

        System.out.println(days);
    }
}
