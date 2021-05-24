
import java.util.Scanner;

public class No10871_X보다작은수 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int x=scanner.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<arr.length;i++)
			arr[i]=scanner.nextInt();
		for (int k=0;k<arr.length;k++) {
			if (arr[k]<x) {
				System.out.print(arr[k]+" ");
			}
		// TODO Auto-generated method stub

	}

}
}