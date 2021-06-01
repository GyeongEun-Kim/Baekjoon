import java.util.Scanner;

public class No1193_분수찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        int cnt=0;

        while (n>sum) {
            cnt++;
            sum=sum+cnt;
        }

        int prev =sum-cnt;
        int gap = n-prev;
        int son;//분자
        int mother;//분모


        if (cnt%2!=0) {
            son = cnt - gap + 1;
            mother = gap;
        }
        else {
            son = gap;
            mother =  cnt-gap+1;
        }

        System.out.println(son+"/"+mother);

    }
}
