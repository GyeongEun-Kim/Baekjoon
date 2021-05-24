
import java.io.*;


public class No1010_다리놓기_실패 {
	
	private static int combination(int m, int n) {
		if (n==m || n==0)
			return 1;
		else
			return combination(m-1,n-1)+combination(m-1,n);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int t=0;t<testcase;t++) {
			String temp=br.readLine();
			int n=Integer.parseInt(temp.split(" ")[0]);
			int m=Integer.parseInt(temp.split(" ")[1]);
			
			System.out.println(combination(m,n));
			
			}
		}
	}
	

