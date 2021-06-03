import java.io.*;

public class No2775_부녀회장이될테야 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i=0;i<testcase;i++) {
            int k= Integer.parseInt(br.readLine()); //층
            int n= Integer.parseInt(br.readLine()); //호
            int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14}; //0층
            int sum=0;

            for (int j=1;j<k;j++) {
                for (int t=1;t<n;t++) {
                    arr[t]=arr[t-1]+arr[t];
                }
                //System.out.println(j+1+"층: "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);

            }

            for (int x=0;x<n;x++) {
                sum+=arr[x];
               // System.out.println(arr[x]);

            }
           // System.out.println();
            System.out.println(sum);
        }
    }
}
