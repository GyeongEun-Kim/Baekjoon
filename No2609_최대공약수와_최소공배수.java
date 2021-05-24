
import java.io.*;
public class No2609_최대공약수와_최소공배수 {
	public static int gcd (int num1, int num2) {
		if(num2==0) 
			return num1;
		else
			return gcd(num2,num1%num2);
	}
	
	public static int lcm (int num1, int num2, int g) { 
		if (g!= 0)
			return g*(num1/g)*(num2/g);
		return 0;
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[2];
		arr=br.readLine().split(" ");
		int num1= Integer.parseInt(arr[0]);
		int num2= Integer.parseInt(arr[1]);
		
		int g=gcd(num1,num2);
		
		
		System.out.println(g);
		System.out.println(lcm(num1,num2,g));
		// TODO Auto-generated method stub

	}

}
