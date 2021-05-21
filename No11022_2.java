package baekjunalgorithm;
import java.util.Scanner;

public class No11022_2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		int arr[]=new int[t*3];
		for (int i=0;i<t;i++) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int c=a+b;
			arr[3*i]=a;
			arr[3*i+1]=b;
			arr[3*i+2]=c;
		}
		
		// TODO Auto-generated method stub
		for (int i=0;i<t;i++) {
			System.out.println("Case #" +(i+1)+ ": " +arr[i*3]+ " + " +arr[i*3+1]+ " = " +arr[i*3+2]);
		}
	}

}
