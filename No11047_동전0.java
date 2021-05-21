package baekjunalgorithm;
import java.io.*;
import java.util.Arrays;

public class No11047_동전0 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);
		int value[]= new int[n];
		
		for (int i=0;i<n;i++) {
			value[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(value);
		
		int cnt=0;
		int idx=value.length-1;
		
		while (k!=0) {
			if (k>=value[idx]) {
				k=k-value[idx];
				cnt++;
			}
			else
				idx--;
		}
		
		System.out.println(cnt);
		// TODO Auto-generated method stub

	}

}
