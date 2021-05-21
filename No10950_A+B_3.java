package baekjunalgorithm;
import java.util.Scanner;

public class No10950 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		int arr[]=new int[t];
		for (int i=0;i<t;i++) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			
			arr[i]=a+b;
		}
		for (int i=0;i<t;i++)
			System.out.println(arr[i]);
		
		// TODO Auto-generated method stub
		scanner.close();
	}

}
