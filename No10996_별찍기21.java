
import java.util.Scanner;
public class No10996_별찍기21 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int star=scanner.nextInt();
		
		for (int j=0;j<star;j++) {
			
			for (int i=0;i<star-star/2;i++) {
				System.out.print("* ");
			}
			
		System.out.println("");
		
			for (int i=0;i<star/2;i++) {
				System.out.print(" *");
		}
		
		System.out.println("");
		// TODO Auto-generated method stub

	}
	}
}
