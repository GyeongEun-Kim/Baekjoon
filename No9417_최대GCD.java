package baekjunalgorithm;

import java.io.*;
public class No9417_최대GCD {
	public static int gcd(int n, int m) {
		if(m==0)
			return n;
		else
			return gcd(m,n%m);
	}

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());

		for (int i=0;i<testcase;i++) {
			int max=0;
			
			String temp[]=br.readLine().split(" ");
			int arr[] = new int[temp.length];
			
			for (int k=0;k<temp.length;k++) {
				arr[k]=Integer.parseInt(temp[k]);
			}
			
			for (int j=0;j<arr.length-1;j++) {
				for (int t=j+1;t<arr.length;t++) {
					if (gcd(arr[j],arr[t])>max)
						max=gcd(arr[j],arr[t]);
				}
			}
			
			System.out.println(max);
		}
		// TODO Auto-generated method stub

	}

}
