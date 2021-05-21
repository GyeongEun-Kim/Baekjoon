package baekjunalgorithm;
import java.util.Scanner;
public class No2523 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int star=scanner.nextInt();
		
		for (int i=0;i<star;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		star=star-1;
		for (int i=1;i<=star;i++) {
			for (int j=star;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// TODO Auto-generated method stub

}

}
