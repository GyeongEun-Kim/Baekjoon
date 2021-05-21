package baekjunalgorithm;
import java.util.Scanner;
public class No2446 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int star=scanner.nextInt();
		int j;
		for (int i=0;i<star;i++) {
			for (int k=0;k<i;k++) {
				System.out.print(" ");
				} 
			for (j=1;j<=2*(star-i)-1;j++) {
					
				System.out.print("*");
		}
		System.out.println("");
		}
		
		for (int i=star-1;i>0;i--) {
			for (int k=i-1;k>0;k--) {
				System.out.print(" ");
				} 
			for (j=2*(star-i);j>=0;j--) {
					
				System.out.print("*");
		}
		System.out.println("");
		}
		// TODO Auto-generated method stub

	}
}