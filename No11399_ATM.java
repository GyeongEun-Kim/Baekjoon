package baekjunalgorithm;
import java.io.*;
import java.util.Arrays;

public class No11399_ATM {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ppl = Integer.parseInt(br.readLine());
		String temp[] = br.readLine().split(" ");
		int time[]= new int[ppl];
		
		//System.out.println(temp.split(" ")[0]);
		
		for (int i=0;i<ppl;i++) {
			time[i]=Integer.parseInt(temp[i]);
		}
		
		Arrays.sort(time);
		
		int sum=0;
		
		for (int i=0;i<ppl;i++) {
			for (int j=0;j<i;j++) {
				sum=sum+time[j];
			}
			sum=sum+time[i];
		}
		
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
