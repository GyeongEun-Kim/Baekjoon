
import java.util.Scanner;
public class No2439_별찍기2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int star=scanner.nextInt();
		for (int i=1;i<=star;i++) {
			
				for (int k=1;k<=star-i;k++) {
					System.out.print(" ");
				}
				for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		// TODO Auto-generated method stub

	}

}
