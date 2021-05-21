package baekjunalgorithm;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No1541_잃어버린괄호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		
		ArrayList<String> arr = new ArrayList<String>();
		
		int result=0;
		
		StringTokenizer stk = new StringTokenizer(temp,"-");
		
		while (stk.hasMoreTokens()) {
			arr.add(stk.nextToken());
		}
		
		
		for (int i=0;i<arr.size();i++) {
			String tempItems[]=arr.get(i).split("\\+");
			int sum=0;
			for (int j=0;j<tempItems.length;j++) {
				sum+= Integer.parseInt(tempItems[j]);
			}
			if (i==0)
				result+=sum;
			else
				result-=sum;
		}
		
		System.out.println(result);

	}

}
