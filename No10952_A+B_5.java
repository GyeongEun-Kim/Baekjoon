package baekjunalgorithm;
import java.util.Scanner;

public class No10952 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=1,b=1;
		int arr[]=new int[100];
		int i=0;
		while (a!=0 && b!=0) {
			
			a=scanner.nextInt();
			b=scanner.nextInt();
			arr[i]=a+b;
			i=i+1;
		}
		int k=0;
		
		 while (arr[k]!=0) {
			System.out.println(arr[k]);
			k=k+1;
		}
		// TODO Auto-generated method stub

	}

}
