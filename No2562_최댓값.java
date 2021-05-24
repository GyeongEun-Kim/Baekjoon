
import java.util.Scanner;
public class No2562_최댓값 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[9];
		int max=0;
		int where=0;
		for (int i=0;i<9;i++)
			arr[i]=scanner.nextInt();
		for (int i=0;i<9;i++) {
			if (max<arr[i]) {
				max=arr[i];
				where=i+1;
		}}
		
		System.out.println(max);
		System.out.println(where);
		// TODO Auto-generated method stub

	}

}
